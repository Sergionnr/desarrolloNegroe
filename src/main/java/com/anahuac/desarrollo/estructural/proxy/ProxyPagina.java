package com.anahuac.desarrollo.estructural.proxy;

import java.util.ArrayList;

public class ProxyPagina implements Acceso {
	private ArrayList<String> paginasBanned;
	private Pagina pagina;
	public ProxyPagina(ArrayList<String> paginaBanned) {
		this.pagina = new Pagina();
		this.paginasBanned = paginaBanned;
	}
	public void abrir(String nombre, Usuario usuario) {
		if(!this.paginasBanned.contains(nombre) || usuario.getPermiso()) {
			this.pagina.abrir(nombre, usuario);
		}
		else {
			System.out.println("La direccion " + nombre + " esta bloqueda para el usuario " + usuario.getNombre());
		}
	}
}
