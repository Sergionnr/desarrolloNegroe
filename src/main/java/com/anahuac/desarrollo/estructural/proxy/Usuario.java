package com.anahuac.desarrollo.estructural.proxy;

public class Usuario {
	private Boolean permiso;
	private String nombre;

	public Usuario(Boolean permiso, String nombre) {
		this.permiso = permiso;
		this.nombre = nombre;
	}

	public Boolean getPermiso() {
		return permiso;
	}

	public void setPermiso(Boolean permiso) {
		this.permiso = permiso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
