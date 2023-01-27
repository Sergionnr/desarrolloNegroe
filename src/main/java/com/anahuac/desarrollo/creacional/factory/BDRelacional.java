package com.anahuac.desarrollo.creacional.factory;

public class BDRelacional extends BDCreator { //Factory concreta
	public BDRelacional(String tipo) {
		this.tipoBD = tipo;
	}
	public DBConexion createBD() { //Factory method implementado
		if(this.tipoBD.equals("Oracle")) {
			return new Oracle();
		}
		else if(this.tipoBD.equals("MySQL")) {
			return new MySQL();
		}
		return null;
	}
}
