package com.anahuac.desarrollo.estructural.decorator;

public abstract class Recibo {
	String descripcion = "DescripcionBase";
	public String getDescripcion() {
		return this.descripcion;
	}
	public abstract int costo();
}
