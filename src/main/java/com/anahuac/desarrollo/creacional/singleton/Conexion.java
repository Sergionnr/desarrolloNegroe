package com.anahuac.desarrollo.creacional.singleton;

public class Conexion {
	private static Conexion instance = new Conexion();
	private Conexion() {
		
	}
	public static Conexion getInstance() {
		return Conexion.instance;
	}
	public void open() {
		System.out.println("Conexion realizada");
	}
	public void consultaReporteAlumno() {
		System.out.println("Reporte alumnos");
	}
	public void consultaReporteCalificacion() {
		System.out.println("Reporte calificaciones");
	}
}
