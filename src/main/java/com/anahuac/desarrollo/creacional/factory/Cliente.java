package com.anahuac.desarrollo.creacional.factory;

public class Cliente {

	public static void main(String[] args) {
		BDRelacional bdrel = new BDRelacional("MySQL");
		BDNoRelacional bdnorel = new BDNoRelacional("MongoDB");
		
		Reporte ejemploReporte = new Reporte(bdrel);
		ejemploReporte.verReporte();
	}

}
