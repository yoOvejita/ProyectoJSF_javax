package com.pepe;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.servlet.http.Part;

@SessionScoped
@ManagedBean(name="subirArchivoManagedBean")
public class SubirArchivoManagedBean {
	private Part archivo;
	private String imagen = "";
	public Part getArchivo() {
		return archivo;
	}
	public void setArchivo(Part archivo) {
		this.archivo = archivo;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String subir() {
		HerramientaDeArchivos tool = new HerramientaDeArchivos();
		imagen = tool.realizarSubida(archivo);
		return "resultado5";
	}
}
