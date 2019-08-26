package com.senati.ddw05;

public class persona {
	int id;
	String nombre;
	String apellido;
	String Sexo;
	String fnac;
	public persona() {
		super();
	}
	public persona(int id, String nombre, String apellido, String sexo, String fnac) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		Sexo = sexo;
		this.fnac = fnac;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public String getFnac() {
		return fnac;
	}
	public void setFnac(String fnac) {
		this.fnac = fnac;
	}
	@Override
	public String toString() {
		return "persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", Sexo=" + Sexo + ", fnac="
				+ fnac + "]";
	}
	
	
}
