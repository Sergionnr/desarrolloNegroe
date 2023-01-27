package com.anahuac.desarrollo.creacional.factory;

public class MySQL implements DBConexion{
	public MySQL() {	}
	public void abrirConexion() {
		System.out.println("Se abre conexion en base de datos MySQL");
	}
	public void ejecutarSentencia() {
		System.out.println("Se consulta la base de datos MySQL");
	}
	public void cerrarConexion() {
		System.out.println("Se cierra conexion en base de datos MySQL");
	}
}
