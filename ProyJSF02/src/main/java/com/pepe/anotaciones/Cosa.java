package com.pepe.anotaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;
@Target(ElementType.PARAMETER)
@Inherited
public @interface Cosa {
	String nombre();
	int cantidad() default 20;
	String[] valores();
}


/*
@Target TYPE
@Target FIELD
@Target CONSTRUCTOR
@Target METHOD
@Target PARAMETER
 */