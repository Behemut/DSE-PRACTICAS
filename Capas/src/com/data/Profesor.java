package com.data;

public class Profesor {
	private String nombre;
	private long celular;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getCelular() {
		return celular;
	}
	public void setCelular(long celular) {
		this.celular = celular;
	}
	public Profesor(String nombre, long celular) {
		super();
		this.nombre = nombre;
		this.celular = celular;
	}
	
	
	
	
}
