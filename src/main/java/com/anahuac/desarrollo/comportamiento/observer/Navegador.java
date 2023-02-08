package com.anahuac.desarrollo.comportamiento.observer;

public class Navegador implements Observer {
	String cuentaNavegador;
	public Articulo articulo;
	/*public Navegador(Articulo articulo) {
		this.articulo = articulo;
		articulo.registerObserver(this);
	}*/
	public Navegador(String cuenta) {
		this.cuentaNavegador = cuenta;
	}
	public void update(int precio, int precioAnterior) {
		if(precio < precioAnterior) {
			System.out.println("Notificacion para " + this.cuentaNavegador);
			System.out.println("El precio de su articulo ha bajado $" + (precioAnterior - precio));
		}
	}
}
