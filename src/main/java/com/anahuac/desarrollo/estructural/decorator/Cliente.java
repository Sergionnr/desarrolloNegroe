package com.anahuac.desarrollo.estructural.decorator;

public class Cliente {

	public static void main(String[] args) {
		Recibo juan = new ServicioBase();
		juan = new Prime(juan);
		juan = new HBO(juan);
		System.out.println(juan.getDescripcion() + ", con costo de $" + juan.costo());
	}
}
