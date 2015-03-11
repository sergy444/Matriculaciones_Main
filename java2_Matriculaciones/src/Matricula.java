package com.zubiri.matriculas;

public class Matricula extends Asignatura {
	
	int a�oMatriculacion;
    double precio;

	public Matricula(String nombre, int creditos, Profesor profesor, int a�oMatriculacion, double precio) {
		super(nombre, creditos, profesor);
		this.a�oMatriculacion = a�oMatriculacion;
		this.precio = precio;
	}
	
	public int getA�oMatriculacion() {
		return a�oMatriculacion;
	}
	
	public void setA�oMatriculacion(int a�oMatriculacion) {
		this.a�oMatriculacion = a�oMatriculacion;
	}
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
    
	
	/**
	 * Método que calcula un descuento basado en porcentaje sobre el precio original
	 * de la matrícula.
	 * @return
	 */
	public double descuentoFamiliaNumerosa(int porcentaje) {
		
		double precioDescontado = porcentaje * this.precio / 100;
		double precioTotal = this.precio - precioDescontado;
				
		return precioTotal;		
	}
	
}
