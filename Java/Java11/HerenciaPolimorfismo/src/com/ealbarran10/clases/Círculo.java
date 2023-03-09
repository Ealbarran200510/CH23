package com.ealbarran10.clases;

import java.util.Scanner;

public class Círculo extends FigurasGeometricas{
	
	private int radio;
	
	public Círculo(int radio) {
		
		super("Círculo");
		
		this.radio = radio;
		
	}

	public double areas () {
		
		return Math.PI * Math.pow(radio, 2);
		
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = (int) radio;
	}

	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		
		Scanner datos = new Scanner (System.in);
		
		System.out.print("Introduce el radio");
		double r = datos.nextDouble();
		setRadio(r);

	}

}
