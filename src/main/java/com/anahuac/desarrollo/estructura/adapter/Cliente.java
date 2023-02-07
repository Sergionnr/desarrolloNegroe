package com.anahuac.desarrollo.estructura.adapter;
import java.util.Date;

final class Cliente {

	public static void main(String[] args) {
		DepA Pedro = new DepA("Pedro Hernandez", 31);
		DepA Jorge = new DepA("Jorge Alvarado", 27);
		Date fechaN = new Date(1960, 6, 30);
		DepB Federico = new DepB("Federico", "Bocanegra", fechaN);
		Pedro.print();
		Jorge.print();
		Federico.print();
		AdapterA FedericoAdapt = new AdapterA(Federico);
		System.out.println(FedericoAdapt.getNombre());
		System.out.println(FedericoAdapt.getEdad());
	}
}
