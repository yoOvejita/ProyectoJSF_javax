package com.pepe;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.pepe.Modelos.Cuenta;

@SessionScoped
@ManagedBean(name="cuentaManagedBean")
public class CuentaManagedBean {
	private Cuenta cuenta;
	public CuentaManagedBean() {
		cuenta = new Cuenta();
		cuenta.setTrabajando(true);
		cuenta.setGenero("M");
		cuenta.setLenguajesprog(new String[] {"l02","l04"});
	}
	public Cuenta getCuenta() {
		return cuenta;
	}
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	public String registrar() {
		return "resultado3";
	}
}
