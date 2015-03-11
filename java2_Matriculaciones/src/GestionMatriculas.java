package com.zubiri.matriculas;

import java.util.Scanner;

public class GestionMatriculas {

	public static void main(String[] args) {		

		int opcion;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Matriculacion------------------------------------1");
			System.out.println("Salir--------------------------------------------2");
			   
			opcion = sc.nextInt();
			switch (opcion) {
				
				case 1:
					System.out.print("Ingrese el año de matriculacion: ");
					int añoMatricula = Integer.parseInt(sc.next());
					System.out.print("Ingrese el precio de matriculacion: ");
					double precioMatricula = Double.parseDouble(sc.next());
					System.out.print("Ingrese el descuento de matriculacion: ");
					int descuentoMatricula = Integer.parseInt(sc.next());
					Profesor objetoProfesor = new Profesor("98765432S", "Sonia", "Ortiz de Arri", "Profesor", "Informatica");
					Matricula objetoMatricula = new Matricula("Programacion", 10, objetoProfesor, añoMatricula, precioMatricula);
					System.out.print("El precio de su matricula es " + Matricula.descuentoFamiliaNumerosa(descuentoMatricula) + "€\n");
					break;
				case 2:
					break;
				default:
					System.out.println("Opcion incorrecta");
			}
		} while (opcion != 2);
	}
}
