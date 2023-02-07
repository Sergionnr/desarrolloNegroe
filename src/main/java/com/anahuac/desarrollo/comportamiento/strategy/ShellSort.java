package com.anahuac.desarrollo.comportamiento.strategy;
import java.util.Arrays;

public class ShellSort implements SortBehavor {
	public int[] sort(int[] lista) {
		System.out.println("Se está ordenando con el método Shell");
		Arrays.sort(lista);
		return lista;
	}
}
