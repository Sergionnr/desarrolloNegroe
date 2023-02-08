package com.anahuac.desarrollo.comportamiento.observer;
import java.util.*;

public class Articulo implements Subject {
	String nombre;
	int precio;
	int precioAnterior;
	ArrayList<Observer> observers;
	public Articulo(String nombre, int precio) {
		this.observers = new ArrayList<Observer>();
		this.nombre = nombre;
		this.precio = precio;
		this.precioAnterior = precio;
	}
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i >= 0) {
			observers.remove(i);
		}
	}
	public void notifyObservers() {
		for(int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(this.precio, this.precioAnterior);
		}
	}
	public void setPrecio(int precio) {
		this.precioAnterior = this.precio;
		this.precio = precio;
		notifyObservers();
	}
}
