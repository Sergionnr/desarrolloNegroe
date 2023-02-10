package com.anahuac.desarrollo.comportamiento.template;

public abstract class Logger {
	public void open() {
		System.out.println("Se abre el archivo");
	}
	public abstract void format(Evento evento);
	public void save() {
		System.out.println("Se guarda el archivo");
	}
	public void close() {
		System.out.println("Se cierra el archivo");
	}
	public final void write(Evento evento) {
		open();
		format(evento);
		save();
		close();
	}
}
