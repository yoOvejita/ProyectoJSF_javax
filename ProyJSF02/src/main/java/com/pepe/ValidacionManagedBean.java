package com.pepe;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.pepe.Modelos.CuentaSimple;

@SessionScoped
@ManagedBean(name="validacionManagedBean")
public class ValidacionManagedBean {
	private CuentaSimple cuenta;

	public CuentaSimple getCuenta() {
		return cuenta;
	}

	public void setCuenta(CuentaSimple cuenta) {
		this.cuenta = cuenta;
	}

	public ValidacionManagedBean() {
		super();
		cuenta = new CuentaSimple();
	}
	public String Guardar() {
		return "resultado6?faces-redirect=true";
	}
}
