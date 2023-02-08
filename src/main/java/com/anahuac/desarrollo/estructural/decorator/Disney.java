package com.anahuac.desarrollo.estructural.decorator;

public class Disney extends ReciboDecorator{
	Recibo rec;
	public Disney(Recibo rec) {
		this.rec = rec;
	}
	public String getDescripcion() {
		return rec.getDescripcion() + " con Disney plus";
	}
	public int costo() {
		return rec.costo()+100;
	}
}
