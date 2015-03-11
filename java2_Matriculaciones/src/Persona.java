package com.zubiri.matriculas;

public abstract class Persona {
	
	String dni;
	String nombre;
	String apellido;
	
	public Persona() {
		
	}
	
	public Persona (String dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
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
	
	/**
	 * Método que retorna un String con los valores de las propiedades
	 * formateados del siguiente modo:
	 *  <NOMBRE_PROPIEDAD1> : <VALOR_PROPIEDAD1>\n
	 *  <NOMBRE_PROPIEDAD2> : <VALOR_PROPIEDAD2>\n 
	 *  .....
	 * @return String
	 */
	
	public String formattedPersona() {
		
		String formattedPersona = "DNI: " +	this.dni + "\n" + 
				"NOMBRE: " +	this.nombre + "\n" + 
				"APELLIDO: " +	this.apellido + "\n";
				
		return formattedPersona;
	}
	
	/**
	 * Método que obtiene valores de una persona a partir de un String y 
	 * un caracter separador.
	 */
	public void split(String personaStr, String separator) {
		
		String[] palabras = personaStr.split(separator);
		this.setDni(palabras[0]);
		this.setNombre(palabras[1]);
		this.setApellido(palabras[2]);
		
	}
}
