package com.zubiri.matriculas;

public class Matricula extends Asignatura {
	
	int aņoMatriculacion;
    double precio;

	public Matricula(String nombre, int creditos, Profesor profesor, int aņoMatriculacion, double precio) {
		super(nombre, creditos, profesor);
		this.aņoMatriculacion = aņoMatriculacion;
		this.precio = precio;
	}
	
	public int getAņoMatriculacion() {
		return aņoMatriculacion;
	}
	
	public void setAņoMatriculacion(int aņoMatriculacion) {
		this.aņoMatriculacion = aņoMatriculacion;
	}
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
    
	
	/**
	 * MÃŠtodo que calcula un descuento basado en porcentaje sobre el precio original
	 * de la matrÃ­cula.
	 * @return
	 */
	public double descuentoFamiliaNumerosa(int porcentaje) {
		
		double precioDescontado = porcentaje * this.precio / 100;
		double precioTotal = this.precio - precioDescontado;
				
		return precioTotal;		
	}
	
}
