package com.anahuac.desarrollo.comportamiento.template;

public class LoggerTXT extends Logger {
	Evento evento;

	public LoggerTXT() {
	}
	public void format(Evento evento) {
		System.out.println(evento.getTipo() + " " + evento.getFecha() + " " + evento.getHora() + " " + evento.getMsg());
	}
}
