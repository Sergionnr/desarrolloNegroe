package com.anahuac.desarrollo.comportamiento.observer;

public class WhatsApp implements Observer {
	int telefono;
	public Articulo articulo;
	/*public Navegador(Articulo articulo) {
		this.articulo = articulo;
		articulo.registerObserver(this);
	}*/
	public WhatsApp() {
		
	}
	public void update(int precio, int precioAnterior) {
		if(precio < precioAnterior) {
			System.out.println("Mensaje para " + this.telefono);
			System.out.println("El precio de su articulo ha bajado $" + (precioAnterior - precio));
		}
	}
}
