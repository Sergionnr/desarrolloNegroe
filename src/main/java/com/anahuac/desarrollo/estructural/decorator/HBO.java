package com.anahuac.desarrollo.estructural.decorator;

public class HBO extends ReciboDecorator{
	Recibo rec;
	public HBO(Recibo rec) {
		this.rec = rec;
	}
	public String getDescripcion() {
		return rec.getDescripcion() + " con HBO Max";
	}
	public int costo() {
		return rec.costo()+100;
	}
}
