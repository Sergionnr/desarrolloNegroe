package com.anahuac.desarrollo.estructural.proxy;

public class Pagina implements Acceso {
	public Pagina() {	}
	public void abrir(String nombre, Usuario usuario) {
		System.out.println("Usuario " + usuario.getNombre() + " solicito abrir la direccion " + nombre);
	}
}
