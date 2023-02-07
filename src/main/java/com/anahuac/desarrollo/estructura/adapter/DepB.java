package com.anahuac.desarrollo.estructura.adapter;
import java.util.Date;

public class DepB {
	String nombre;
	String apellido;
	Date fechaN;
	public DepB(String nombre, String apellido, Date fechaN) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaN = fechaN;
	}
	public void print() {
		System.out.println(this.nombre + " " + this.apellido + " " + (2023 - this.fechaN.getYear()));
	}
}
