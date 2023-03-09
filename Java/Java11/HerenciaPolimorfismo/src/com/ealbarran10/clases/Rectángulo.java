package com.ealbarran10.clases;

import java.util.Scanner;

public class Rectángulo extends FigurasGeometricas {
	
	private double base;
	private double altura;
	

	public Rectángulo(double base, double altura) {
		
		super("Rectángulo");
		
		this.base = base;
		this.altura = altura;
	}

	public double areas() {
		return base * altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void pedirDatos () {

		Scanner datos = new Scanner (System.in);
		
		System.out.print("Introduce la base");
		double b = datos.nextDouble();
		setBase(b);
		
		System.out.print("Introduce la altura");
		this.setAltura(datos.nextDouble());
		
	}
	
}
