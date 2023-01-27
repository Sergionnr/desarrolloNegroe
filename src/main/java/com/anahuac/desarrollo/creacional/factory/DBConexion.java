package com.anahuac.desarrollo.creacional.factory;

public interface DBConexion {
	public void abrirConexion();
	public void ejecutarSentencia();
	public void cerrarConexion();
}
