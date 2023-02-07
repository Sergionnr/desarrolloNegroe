package com.anahuac.desarrollo.estructura.adapter;

public class DepA {
	String nombreC;
	int edad;
	public DepA(String nombreC, int edad) {
		this.nombreC = nombreC;
		this.edad = edad;
	}
	public void print() {
		System.out.println(this.nombreC + " " + this.edad);
	}
}
