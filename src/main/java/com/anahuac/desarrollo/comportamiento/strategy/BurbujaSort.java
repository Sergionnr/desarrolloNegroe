package com.anahuac.desarrollo.comportamiento.strategy;
import java.util.Arrays;

public class BurbujaSort implements SortBehavor {
	public int[] sort(int[] lista) {
		System.out.println("Se está ordenando con el método Burbuja");
		Arrays.sort(lista);
		return lista;
	}
}
