package com.anahuac.desarrollo.estructural.proxy;

import java.util.ArrayList;

class Controlador {

	public static void main(String[] args) {
		ArrayList<String> arreglo = new ArrayList();
		arreglo.add("www.facebook.com");
		arreglo.add("www.instagram.com");
		arreglo.add("www.tiktok.com");
		ProxyPagina proxy = new ProxyPagina(arreglo);
		Usuario alumno = new Usuario(false, "Almuno Rashyd");
		Usuario profesor = new Usuario(true, "Prof. Madera");
		proxy.abrir("www.facebook.com", alumno);
		proxy.abrir("www.google.com", alumno);
		proxy.abrir("www.facebook.com", profesor);
		proxy.abrir("www.google.com", profesor);
	}

}