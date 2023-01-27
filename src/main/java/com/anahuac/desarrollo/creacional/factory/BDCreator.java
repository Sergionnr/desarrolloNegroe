package com.anahuac.desarrollo.creacional.factory;

public abstract class BDCreator { //Clase Creadora de Factories con método común
	String tipoBD;
	protected abstract DBConexion createBD(); //Factory method abstracto
	
	public void consultarReporte() { //Método común a todas las Factories
		DBConexion bdejemplo = createBD();
		bdejemplo.abrirConexion();
		bdejemplo.ejecutarSentencia();
		bdejemplo.cerrarConexion();
	}
}
