package com.pepe;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.pepe.Modelos.Producto;

@SessionScoped
@ManagedBean(name="ejemploManagedBean")
public class EjemploManagedBean {
	private String nombre;
	private int edad;
	private double estatura;
	private boolean casado;
	private Producto producto;
	private List<Producto> productos;
	public EjemploManagedBean(){
		//Ejemplos de primitivas
		nombre = "N/A";
		edad = 18;
		estatura = 1.7;
		casado = false;
		//Ejemplo con un objeto
		producto = new Producto(1, "Queso", 14.5, "queso.jpg", 12);
		//Ejemplo con una lista de objetos
		productos = new ArrayList<Producto>();
		productos.add(new Producto(1, "Queso", 9.5, "queso.jpg", 5));
		productos.add(new Producto(2, "Atún", 12.0, "atun.jpg", 20));
		productos.add(new Producto(3, "Laptop", 4500.0, "comp01.jpg", 3));
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
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
	
}
