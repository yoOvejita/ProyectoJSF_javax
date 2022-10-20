package com.pepe;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.Part;

public class HerramientaDeArchivos {
	private final int limite_maximo = 1024000;
	private final String extensiones_permitidas = "gif|jpg|jpeg|png";
	public String realizarSubida(Part archivoSubir) {
		String nombreArchivoGuardado = "nada.jpg";
		try {
			if(archivoSubir.getSize() > 0) {
				//Efectivamente el archivo exste y tiene contenido
				String nombreDelArchivoSubido = getNombreDeArchivo(archivoSubir);
				if(verificarExtensionDeArchivo(nombreDelArchivoSubido)){
					if(archivoSubir.getSize() > limite_maximo)
						FacesContext.getCurrentInstance().addMessage(null, 
								new FacesMessage(FacesMessage.SEVERITY_INFO, "El tamaño del archivo es muy grande",""));
					else {
						String nombreActualDelArchivoSubido = nombreDelArchivoSubido;
						String extension = nombreActualDelArchivoSubido.substring(nombreActualDelArchivoSubido.lastIndexOf("."), nombreActualDelArchivoSubido.length()); // foto.fondoceleste.10x10.jpg
						//Vamos a generar un nombre aleatorio para el archivo
						Long nombreAlAzar = Calendar.getInstance().getTimeInMillis();
						String cuevoNombreArchivoGuardado = nombreAlAzar + extension;//asumimos que el punto va con la extension
						nombreArchivoGuardado = cuevoNombreArchivoGuardado; //este nombre se retorna
						String ubicacionDelArchivo = 
								FacesContext.getCurrentInstance().getExternalContext().getRealPath("")
								+ "resources" + File.separator + "imagenes";
						try {
							//Cargamos el contenido como un arreglo de bytes
							byte[] contenido = new byte[(int)archivoSubir.getSize()];
							InputStream in = archivoSubir.getInputStream();
							in.read(contenido);
							
							//Preparar la clase File
							File archivoACrear = new File(ubicacionDelArchivo,nombreArchivoGuardado);
							File folder = new File(ubicacionDelArchivo);//Opcional, si el/los folder(s) no existen
							if(!folder.exists())
								folder.mkdirs();
							
							//Vamos a crear el archivo en el servido
							FileOutputStream fos = new FileOutputStream(archivoACrear);
							fos.write(contenido);
							fos.flush();
							fos.close();
							nombreArchivoGuardado = cuevoNombreArchivoGuardado; 
						}catch(IOException ee) {
							System.out.println("Error IO");
							nombreArchivoGuardado = "nada.jpg";
						}
					}
				}
					
			}else {
				System.out.println("Error porquye el archivo no tiene tamaño > 0");
					nombreArchivoGuardado = "nada.jpg";
			}
		
		}catch(Exception e) {
			System.out.println("Error general");
			System.out.println(e.getMessage());
			nombreArchivoGuardado = "nada.jpg";
		}
		return nombreArchivoGuardado;
	}
	private boolean verificarExtensionDeArchivo(String nombreDelArchivoSubido) { // foto.jpg 
		if(nombreDelArchivoSubido.length() > 0) {
			String[] elementos = nombreDelArchivoSubido.split("\\.");
			if(elementos.length > 0) {
				String extension = elementos[elementos.length - 1]; //0:[foto] 1:[jpg]
				return extensiones_permitidas.contains(extension);
			}
		}
		return false;
	}
	private String getNombreDeArchivo(Part archivoSubir) {
		for(String cd : archivoSubir.getHeader("content-disposition").split(";"))
			if(cd.trim().startsWith("filename")) {
				String filename = cd.substring(cd.indexOf("=")+1).trim().replace("\"","");// \imgs\foto.jpg
				return filename.substring(filename.lastIndexOf('/')+ 1).substring(filename.lastIndexOf('\\')+1);// foto.jpg
			}
		return null;
	}
}
