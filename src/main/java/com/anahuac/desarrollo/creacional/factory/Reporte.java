package com.anahuac.desarrollo.creacional.factory;

public class Reporte {
	BDCreator bdejemplo;
	public Reporte(BDCreator bdejemplo) {
		this.bdejemplo = bdejemplo;
	}
	public void verReporte() {
		this.bdejemplo.consultarReporte();
	}
}
