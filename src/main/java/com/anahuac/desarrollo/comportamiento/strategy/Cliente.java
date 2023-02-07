package com.anahuac.desarrollo.comportamiento.strategy;

public class Cliente {

	public static void main(String[] args) {
		int[] numeros = {1, 6, 6, 2, 4, 3, 9, 8, 3, 7};
		BurbujaSort burbuS = new BurbujaSort();
		ListaNum listado = new ListaNum(burbuS, numeros);
		listado.display();
		listado.performSort();
		listado.display();
	}
}
