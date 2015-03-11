package com.zubiri.matriculas;

import java.util.ArrayList;

public class Alumno extends Persona {

	//AÃ±o en el que se inscribiÃ³ por primera vez en alguna asignatura
	int añoInscripcion = -1;
	//Ciclo que cursa el alumno
	String ciclo = null;
	
	
	//MatrÃ­culas realizadas a lo largo de los aÃ±os en las distintas asignaturas
	ArrayList<Matricula> matriculas = null;	
	
	public Alumno(String dni, String nombre, String apellido, int añoInscripcion, String ciclo, ArrayList<Matricula> matriculas) {
		super(dni, nombre, apellido);
		this.añoInscripcion = añoInscripcion;
		this.ciclo = ciclo;
		this.matriculas = matriculas;		
	}
	
	public int getAñoInscripcion() {
		return añoInscripcion;
	}
	
	public void setAñoInscripcion(int añoInscripcion) {
		this.añoInscripcion = añoInscripcion;
	}
	
	public ArrayList<Matricula> getMatriculas() {
		return matriculas;
	}
	
	public void setMatriculas(ArrayList<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
	
	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	
	public Alumno(String personaStr, String separatorPersona, String separator) {

		String[] palabras = personaStr.split(separatorPersona);
		super.split(personaStr, separatorPersona);
		if(palabras[4] != null) {
			String[] palabras2 = palabras[3].split(separator);
			this.setAñoInscripcion(Integer.parseInt(palabras2[0]));
			this.setCiclo(palabras2[1]);
		}
	}
}
