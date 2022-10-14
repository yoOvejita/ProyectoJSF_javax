package com.pepe.Modelos;

public class Cuenta {
	private String usuario;
	private String password;
	private String descripcion;
	private boolean trabajando;
	private String[] lenguajesprog;
	private String rol;
	private String genero;// M: Masculino F: Femenino
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isTrabajando() {
		return trabajando;
	}
	public void setTrabajando(boolean trabajando) {
		this.trabajando = trabajando;
	}
	public String[] getLenguajesprog() {
		return lenguajesprog;
	}
	public void setLenguajesprog(String[] lenguajesprog) {
		this.lenguajesprog = lenguajesprog;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
