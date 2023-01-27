package com.anahuac.desarrollo.creacional.factory;

public class BDNoRelacional extends BDCreator { //Factory concreta
	public BDNoRelacional (String tipo) {
		this.tipoBD = tipo;
	}
	public DBConexion createBD() { //Factory method implementado
		if(this.tipoBD.equals("CouchDB")) {
			return new CouchDB();
		}
		else if(this.tipoBD.equals("MongoDB")) {
			return new MongoDB();
		}
		return null;
	}
}
