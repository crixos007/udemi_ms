package com.caraveo.model;

import java.io.Serializable;

public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	private int edad;
	private String email;
	private String nombre;
	
	public Persona(String nombre, String email, int edad) {
		super();
		this.edad = edad;
		this.email = email;
		this.nombre = nombre;
	}

	public Persona() {
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}