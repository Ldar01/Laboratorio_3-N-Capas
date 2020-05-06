package com.uca.capas.act3.domain;

public class Student {
	private String nombre;
	private String apellido;
	private String fEntrada;
	private String carreara;
	private boolean estado;
	
	public Student() {
		
	}
		
	public Student(String nombre, String apellido, String fEntrada, String carreara, boolean estado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fEntrada = fEntrada;
		this.carreara = carreara;
		this.estado = estado;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getfEntrada() {
		return fEntrada;
	}
	public void setfEntrada(String fEntrada) {
		this.fEntrada = fEntrada;
	}
	public String getCarreara() {
		return carreara;
	}
	public void setCarreara(String carreara) {
		this.carreara = carreara;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public String delegateEstado() {
		return estado ? "Activo":"Inactivo";
	}
	
}
