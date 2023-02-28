package main;

import java.util.Scanner;

public class HolaJava1 {
	
	private String name;
	
	Scanner sn = new Scanner (System.in);

	public HolaJava1(String name) {
		super();
		this.name = name;
	}
	
	public void saludo() {
		
		System.out.println("Hola " + this.name);
		
	}
	
	public void saludoName () {
		
		System.out.println("Hola " + this.name);
		
	}

}
