package com.anahuac.desarrollo.comportamiento.strategy;
import java.util.Arrays;

public class QuickSort implements SortBehavor {
	public int[] sort(int[] lista) {
		System.out.println("Se está ordenando con el método Quick");
		Arrays.sort(lista);
		return lista;
	}	
}
