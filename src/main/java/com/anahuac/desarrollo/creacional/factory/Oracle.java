package com.anahuac.desarrollo.creacional.factory;

public class Oracle implements DBConexion {
	public Oracle() {	}

	public void abrirConexion() {
		System.out.println("Se abre conexion en base de datos Oracle");
	}
	public void ejecutarSentencia() {
		System.out.println("Se consulta la base de datos Oracle");
	}
	public void cerrarConexion() {
		System.out.println("Se cierra conexion en base de datos Oracle");
	}
}
