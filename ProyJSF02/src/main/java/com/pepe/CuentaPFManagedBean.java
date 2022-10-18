package com.pepe;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.pepe.Modelos.CuentaPF;
@SessionScoped
@ManagedBean(name="cuentaPFManagedBean")
public class CuentaPFManagedBean {
	private CuentaPF cuenta;
	public CuentaPFManagedBean() {
		cuenta = new CuentaPF();
		cuenta.setTrabajando(true);
		cuenta.setGenero("F");//M: Masculino, F: Femenino
		cuenta.setLenguajesprog(new String[] {"l03","l04"});
	}
	
	public CuentaPF getCuenta() {
		return cuenta;
	}

	public void setCuenta(CuentaPF cuenta) {
		this.cuenta = cuenta;
	}

	public String Registrar() {
		return "resultado4";
	}
}
