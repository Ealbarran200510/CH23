package com.ealbarran10.clases;

import java.util.Scanner;

public class Pentágono extends FigurasGeometricas{
	
	private double perimetro;
	private double apotema;
	
	public Pentágono(double perimetro, double apotema) {
		
		super("Pentágono");
		
		this.perimetro = perimetro;
		this.apotema = apotema;
		
	}
	
	public double areas () {
		
		return perimetro * apotema;
		
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
	
		Scanner datos = new Scanner (System.in);
		
		System.out.print("Introduce el perímetro");
		double p = datos.nextDouble();
		setPerimetro(p);
		
		System.out.print("Introduce el perímetro");
		double a = datos.nextDouble();
		setApotema(a);
	}

}
