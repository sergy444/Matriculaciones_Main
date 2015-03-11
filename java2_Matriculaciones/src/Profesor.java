package com.zubiri.matriculas;

public class Profesor extends Persona {

	String titulacion;
	String departamento;
		
	public Profesor(String dni, String nombre, String apellido, String titulacion, String departamento) {
		super(dni, nombre, apellido);
		this.titulacion = titulacion;
		this.departamento = departamento;
	}

	public String getTitulacion() {
		return titulacion;
	}
	
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}	

	public Profesor(String personaStr, String separatorPersona, String separator) {
		
		String[] palabras = personaStr.split(separatorPersona);
		super.split(personaStr, separatorPersona);
		if(palabras[3] != null) {
			String[] palabras2 = palabras[3].split(separator);
			this.setTitulacion(palabras2[0]);
			this.setDepartamento(palabras2[1]);
		}
	}
}
