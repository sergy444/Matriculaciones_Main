package com.zubiri.matriculas;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		
		do{
		
		System.out.println("Bienvenido al programa de Aitor Etxezarreta.");
		System.out.println("\nInserte la opción que desea: ");
		System.out.println("\nPara introducir un alumno pulse 1.");
		System.out.println("\nPara intoducir un profesor pulse 2.");
		System.out.println("\nPara introducir una asignatura pulse 3.");
		System.out.println("\nPara salir del programa pulse 0.");
		opcion = sc.nextInt();
		
		switch(opcion){
		
			case 1:
				
				Alumno alumno = new Alumno(null, null, null, opcion, null, null);
				System.out.println("Bienvenido al creador de alumnos.");
				System.out.println("\nIntroduzca los datos del alumno: ");
				System.out.println("Introduzca el nombre del alumno: ");
				alumno.setNombre(sc.next());
				System.out.println("El apellido: ");
				alumno.setApellido(sc.next());
				System.out.println("El DNI: ");
				alumno.setDni(sc.next());
				System.out.println("El año de matriculación: ");
				alumno.setAñoInscripcion(sc.nextInt());
				System.out.println("¿Qué ciclo está cursando? ");
				alumno.setCiclo(sc.next());
				
				break;
			case 2:
				
				Profesor profe = new Profesor(null, null, null, null, null);
				System.out.println("Bienvenido al creador de profesores.");
				System.out.println("\nIntroduzca los datos del profesor: ");
				System.out.println("Introduzca el nombre del profesor: ");
				profe.setNombre(sc.next());
				System.out.println("El apellido: ");
				profe.setApellido(sc.next());
				System.out.println("El DNI: ");
				profe.setDni(sc.next());
				System.out.println("Introduzca la titulación del profesor: ");
				profe.setTitulacion(sc.next());
				System.out.println("¿En qué departamento trabaja? ");
				profe.setDepartamento(sc.next());
				
				break;
			case 3: 
				
				Asignatura asignatura = new Asignatura(null, 0, profe);
				System.out.println("Bienvenido al creador de asignaturas.");
				System.out.println("Introduzca el nombre: ");
				asignatura.setNombre(sc.next());
				System.out.println("Introduzca el número de creditos que tiene la asignatura: ");
				asignatura.setCreditos(sc.nextInt());
				System.out.println("Ahora se intoducira el profesor: ");
				asignatura.setProfesor(profe);
				
				break;
				
				default:
					
					System.out.println("Opción invalida, introduzca otra vez");
		}		
		} while(opcion > 0 && opcion < 4);
			
		
	}
}
