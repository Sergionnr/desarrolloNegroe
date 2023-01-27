package com.anahuac.desarrollo.creacional.singleton;

public class ReporteAlumnos {
	String info;
	public ReporteAlumnos() {
		this.info = "Info de calificacion";
	}
	public void print() {
		Conexion ejemplo = Conexion.getInstance();
		System.out.println(ejemplo);
		ejemplo.open();
		ejemplo.consultaReporteAlumno();
	}
}
