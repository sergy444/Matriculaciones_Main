package com.zubiri.matriculas;

public class Matricula extends Asignatura {
	
	int añoMatriculacion;
    double precio;

	public Matricula(String nombre, int creditos, Profesor profesor, int añoMatriculacion, double precio) {
		super(nombre, creditos, profesor);
		this.añoMatriculacion = añoMatriculacion;
		this.precio = precio;
	}
	
	public int getAñoMatriculacion() {
		return añoMatriculacion;
	}
	
	public void setAñoMatriculacion(int añoMatriculacion) {
		this.añoMatriculacion = añoMatriculacion;
	}
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
    
	
	/**
	 * MÃ©todo que calcula un descuento basado en porcentaje sobre el precio original
	 * de la matrÃ­cula.
	 * @return
	 */
	public double descuentoFamiliaNumerosa(int porcentaje) {
		
		double precioDescontado = porcentaje * this.precio / 100;
		double precioTotal = this.precio - precioDescontado;
				
		return precioTotal;		
	}
	
}
