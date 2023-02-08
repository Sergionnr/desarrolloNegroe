package com.anahuac.desarrollo.comportamiento.observer;

public class Controlador {

	public static void main(String[] args) {
		Articulo libro = new Articulo("Libro de cocina", 80);
		Correo correo = new Correo("asd@hotmail.com");
		Navegador navegador = new Navegador("Sergio Chrome");
		
		libro.registerObserver(correo);
		libro.registerObserver(navegador);
		libro.setPrecio(50);
		
		Articulo libro2 = new Articulo("Libro de literatura", 180);
		
		libro2.registerObserver(correo);
		libro2.registerObserver(navegador);
		libro2.setPrecio(30);
	}
}
