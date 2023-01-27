package com.anahuac.desarrollo.creacional.singleton;

public class Controlador {
	public static void main(String args[]) {
		ReporteCalificacion calif = new ReporteCalificacion();
		ReporteAlumnos alumn = new ReporteAlumnos();
		calif.print();
		alumn.print();
		
	}
}
