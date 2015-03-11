package com.zubiri.matriculas;

public class Asignatura {

	String nombre;
	int creditos;
	Profesor profesor;
	
	public Asignatura(String nombre, int creditos, Profesor profesor) {
		this.nombre = nombre;
		this.creditos = creditos;
		this.profesor = profesor;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCreditos() {
		return creditos;
	}
	
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	public Profesor getProfesor() {
		return profesor;
	}
	
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	/**
	 * Método que retorna un String con los valores de las propiedades
	 * formateados del siguiente modo:
	 *  <NOMBRE_PROPIEDAD1> : <VALOR_PROPIEDAD1>\n
	 *  <NOMBRE_PROPIEDAD2> : <VALOR_PROPIEDAD2>\n 
	 *  .....
	 * @return String
	 */
	
	public String formattedAsignatura() {
		
		String formattedAsignatura = "NOMBRE: " +	this.nombre + "\n" + 
				"CREDITOS: " +	this.creditos + "\n" + 
				"PROFESOR: " +	this.profesor + "\n";
				
		return formattedAsignatura;
		
	}
	
	/**
	 * Método que obtiene valores de una asignatura a partir de un String y 
	 * un caracter separador.
	 */
	public void split(String asignaturaStr, String separator) {
		
		String[] palabras = asignaturaStr.split(separator);
		this.setNombre(palabras[0]);
		this.setCreditos(Integer.parseInt(palabras[1]));
		this.setProfesor(new Profesor(palabras[2], ",", ";"));
	}
}
