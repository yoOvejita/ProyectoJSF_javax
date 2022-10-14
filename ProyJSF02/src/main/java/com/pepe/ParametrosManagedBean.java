package com.pepe;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.pepe.Modelos.Producto;

@SessionScoped
@ManagedBean(name = "parametrosManagedBean")
public class ParametrosManagedBean {
	private int numero;
	private String texto;
	private Producto producto;
	private List<Producto> productos;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String recibir(int num, String txt) {
		numero = num;
		texto = txt;
		return "resultado";
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public ParametrosManagedBean() {
		productos = new ArrayList<Producto>();
		productos.add(new Producto(1, "Queso", 19.5, "queso.jpg", 5));
		productos.add(new Producto(2, "Atún", 15.0, "atun.jpg", 20));
		productos.add(new Producto(3, "Laptop", 5000.0, "comp01.jpg", 3));
	}
	
	public String recibir2(Producto prod) {
		producto = prod;
		return "resultado2";
	}
}
