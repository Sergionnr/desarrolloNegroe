package com.anahuac.desarrollo.comportamiento.observer;

public class Correo implements Observer {
	String dirCorreo;
	public Articulo articulo;
	/*public Navegador(Articulo articulo) {
		this.articulo = articulo;
		articulo.registerObserver(this);
	}*/
	public Correo(String dirCorreo) {
		this.dirCorreo = dirCorreo;
	}
	public void update(int precio, int precioAnterior) {
		if(precio < precioAnterior) {
			System.out.println("Correo para " + this.dirCorreo);
			System.out.println("El precio de su articulo ha bajado $" + (precioAnterior - precio));
		}
	}
}
