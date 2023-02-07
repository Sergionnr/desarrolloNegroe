package com.anahuac.desarrollo.estructura.adapter;

public class AdapterA implements IDep {
	String nombreC;
	int edad;
	DepB dB;
	public AdapterA(DepB dB) {
		this.dB = dB;
	}
	public void print() {
		System.out.println(this.nombreC + " " + this.edad);
	}
	public String getNombre() {
		this.nombreC = dB.nombre + " " + dB.apellido;
		return this.nombreC;
	}
	public int getEdad() {
		this.edad = 2023 - dB.fechaN.getYear();
		return this.edad;
	}
}
