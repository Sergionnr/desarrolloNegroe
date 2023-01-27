package com.anahuac.desarrollo.creacional.factory;

public class MongoDB implements DBConexion {
	public MongoDB() {	}
	public void abrirConexion() {
		System.out.println("Se abre conexion en base de datos Mongo");
	}
	public void ejecutarSentencia() {
		System.out.println("Se consulta la base de datos Mongo");
	}
	public void cerrarConexion() {
		System.out.println("Se cierra conexion en base de datos Mongo");
	}
}
