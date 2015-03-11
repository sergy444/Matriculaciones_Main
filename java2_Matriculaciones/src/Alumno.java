package com.zubiri.matriculas;

import java.util.ArrayList;

public class Alumno extends Persona {

	//Año en el que se inscribió por primera vez en alguna asignatura
	int a�oInscripcion = -1;
	//Ciclo que cursa el alumno
	String ciclo = null;
	
	
	//Matrículas realizadas a lo largo de los años en las distintas asignaturas
	ArrayList<Matricula> matriculas = null;	
	
	public Alumno(String dni, String nombre, String apellido, int a�oInscripcion, String ciclo, ArrayList<Matricula> matriculas) {
		super(dni, nombre, apellido);
		this.a�oInscripcion = a�oInscripcion;
		this.ciclo = ciclo;
		this.matriculas = matriculas;		
	}
	
	public int getA�oInscripcion() {
		return a�oInscripcion;
	}
	
	public void setA�oInscripcion(int a�oInscripcion) {
		this.a�oInscripcion = a�oInscripcion;
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
			this.setA�oInscripcion(Integer.parseInt(palabras2[0]));
			this.setCiclo(palabras2[1]);
		}
	}
}
