package com.anahuac.desarrollo.estructural.decorator;

public class ServicioBase extends Recibo {
	public ServicioBase() {
		this.descripcion = "Recibo del servicio base";
	}
	public String getDescripcion() {
		return this.descripcion;
	}
	public int costo() {
		return 200;
	}
}
