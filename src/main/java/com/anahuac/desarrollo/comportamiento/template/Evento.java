package com.anahuac.desarrollo.comportamiento.template;

public class Evento {
	String tipo;
	String fecha;
	String hora;
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	String msg;
	public Evento(String tipo, String fecha, String msg, String hora) {
		this.tipo = tipo;
		this.fecha = fecha;
		this.msg = msg;
		this.hora = hora;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
