package com.anahuac.desarrollo.creacional.builder;

public class Laptop {
	private Boolean ssd;
	private int ram;
	private String tGrafica;
	private String procesador;
	private Boolean tecladoANSI;
	private Boolean osUnix;
	private Laptop(LaptopBuilder laptopBuilder) {
		this.ssd = laptopBuilder.ssd;
		this.ram = laptopBuilder.ram;
		this.tGrafica = laptopBuilder.tGrafica;
		this.procesador = laptopBuilder.procesador;
		this.tecladoANSI = laptopBuilder.tecladoANSI;
		this.osUnix = laptopBuilder.osUnix;
	}
	
	public static class LaptopBuilder{
		private Boolean ssd;
		private int ram;
		private String tGrafica;
		private String procesador;
		private Boolean tecladoANSI;
		private Boolean osUnix;
		public LaptopBuilder() {
			System.out.println("Construyendo laptop");
		}
		public LaptopBuilder setSsd(Boolean ssd) {
			this.ssd = ssd;
			if(ssd) {
				System.out.println("Agregando SSD");
			}
			else {
				System.out.println("Agregando Disco duro");
			}
			return this;
		}
		public LaptopBuilder setRam(int ram) {
			this.ram = ram;
			System.out.println("Agregando RAM de " + ram + " GB");
			return this;
		}
		public LaptopBuilder setTGrafica(String tGrafica) {
			this.tGrafica = tGrafica;
			System.out.println("Agregando tarjeta grafica " + tGrafica);
			return this;
		}
		public LaptopBuilder setProcesador(String procesador) {
			this.procesador = procesador;
			System.out.println("Agregando procesador " + procesador);
			return this;
		}
		public LaptopBuilder setTecladoANSI(Boolean tecladoANSI) {
			this.tecladoANSI = tecladoANSI;
			if(ssd) {
				System.out.println("Agregando teclado ANSI");
			}
			else {
				System.out.println("Agregando teclado ISO");
			}
			return this;
		}
		public LaptopBuilder setOsUnix(Boolean osUnix) {
			this.osUnix = osUnix;
			if(ssd) {
				System.out.println("Agregando sistema operativo UNIX");
			}
			else {
				System.out.println("Agregando sistema operativo no UNIX");
			}
			return this;
		}
		public Laptop build() {
			return new Laptop(this);
		}
	}	
}
