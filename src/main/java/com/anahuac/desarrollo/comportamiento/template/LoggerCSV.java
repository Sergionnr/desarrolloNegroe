package com.anahuac.desarrollo.comportamiento.template;

public class LoggerCSV extends Logger {
	Evento evento;

	public LoggerCSV() {
	}
	public void format(Evento evento) {
		System.out.println(evento.getTipo() + ", " + evento.getFecha() + ", " + evento.getHora() + ", " + evento.getMsg());
	}
}
