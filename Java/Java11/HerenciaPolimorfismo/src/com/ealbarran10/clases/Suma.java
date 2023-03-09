package com.ealbarran10.clases;

public class Suma implements OperacionesAritméticas, Mensajes {
	
	private double a;
	private double b;
	
	public Suma (double a, double b) {
		
		this.a = a;
		this.b = b;
	}
	
	

	public Suma() {
		
	}



	@Override
	public void mensaje() {
		// TODO Auto-generated method stub
		
		System.out.println("Mensaje");
		
	}

	public double sumar() {
		// TODO Auto-generated method stub
		return (a+b);
	}

}
