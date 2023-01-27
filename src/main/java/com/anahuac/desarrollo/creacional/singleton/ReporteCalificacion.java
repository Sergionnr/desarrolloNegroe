package com.anahuac.desarrollo.creacional.singleton;

public class ReporteCalificacion {
	String info;
	public ReporteCalificacion() {
		this.info = "Info de calificacion";
	}
	public void print() {
		Conexion ejemplo = Conexion.getInstance();
		System.out.println(ejemplo);
		ejemplo.open();
		ejemplo.consultaReporteCalificacion();
	}
}
	