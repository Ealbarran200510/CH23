package main;

import java.util.Scanner;

public class EjecutarHolaJava1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner (System.in);
		
		HolaJava1 hj1 = new HolaJava1 ("STS");
		hj1.saludo();
	

		String name;
		System.out.println("Escribe tu nombre ");
		name = sn.next();
	
		HolaJava1 hj2 = new HolaJava1(name);
		hj1.saludoName();
		
	}
}

