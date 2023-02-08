package com.anahuac.desarrollo.estructural.decorator;

public class Prime extends ReciboDecorator {
	Recibo rec;
	public Prime(Recibo rec) {
		this.rec = rec;
	}
	public String getDescripcion() {
		return rec.getDescripcion() + " con Amazon Prime";
	}
	public int costo() {
		return rec.costo()+50;
	}
}
