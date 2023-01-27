package com.anahuac.desarrollo.creacional.factory;

public class CouchDB implements DBConexion {
	public CouchDB() {	}
	public void abrirConexion() {
		System.out.println("Se abre conexion en base de datos Couch");
	}
	public void ejecutarSentencia() {
		System.out.println("Se consulta la base de datos Couch");
	}
	public void cerrarConexion() {
		System.out.println("Se cierra conexion en base de datos Couch");
	}
}