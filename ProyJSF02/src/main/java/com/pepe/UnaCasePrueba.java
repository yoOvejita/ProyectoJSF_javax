package com.pepe;

import com.pepe.anotaciones.Cosa;

@Cosa( valores = { "uno","dos","tres" }, nombre="pepe")
public class UnaCasePrueba {
	@Cosa( valores = { "uno","dos","tres" }, nombre="pepe")
	private String un_atributo;
	@Cosa( valores = { "uno","dos","tres" }, nombre="pepe")
	public UnaCasePrueba() {
		super();
	
	}
	@Cosa( valores = { "uno","dos","tres" }, nombre="pepe")
	public void unMetodo() {
		System.out.println("");
		
	}
	
	
	public void otroMetodo(@Cosa( valores = { "uno","dos","tres" }, nombre="pepe") boolean culauierCosa) {
		System.out.println("");
		
	}
}
