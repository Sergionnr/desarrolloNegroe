package com.anahuac.desarrollo.creacional.builder;

public class Controlador {

	public static void main(String[] args) {
		Laptop lap = new Laptop.LaptopBuilder().setSsd(true)
				.setRam(4).setProcesador("i7").build();
		System.out.println();
		Laptop lap2 = new Laptop.LaptopBuilder().setSsd(false)
				.setRam(4).setProcesador("i7").setTecladoANSI(true).setTGrafica("RTX360").build();
	}
}
