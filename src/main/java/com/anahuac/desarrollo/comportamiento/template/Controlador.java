package com.anahuac.desarrollo.comportamiento.template;

public class Controlador {

	public static void main(String[] args) {
		Evento ejemplo = new Evento("txt", "30/7/2002", "Hola", "9:31");
		LoggerTXT loggTxt = new LoggerTXT();
		LoggerCSV loggCsv = new LoggerCSV();
		LoggerJSON loggJson = new LoggerJSON();
		loggTxt.write(ejemplo);
		loggCsv.write(ejemplo);
		loggJson.write(ejemplo);
	}

}
