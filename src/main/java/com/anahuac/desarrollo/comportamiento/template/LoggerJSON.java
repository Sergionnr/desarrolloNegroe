package com.anahuac.desarrollo.comportamiento.template;

public class LoggerJSON extends Logger {
	Evento evento;

	public LoggerJSON() {
	}
	public void format(Evento evento) {
		System.out.println("{'tipo': " + evento.getTipo() + "}");
		System.out.println("{'fecha': " + evento.getFecha() + "}");
		System.out.println("{'Mensaje': " + evento.getMsg() + "}");
		System.out.println("{'Hora': " + evento.getHora() + "}");
	}
}
