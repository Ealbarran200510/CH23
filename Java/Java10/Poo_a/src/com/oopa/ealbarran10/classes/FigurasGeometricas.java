package com.oopa.ealbarran10.classes;

public class FigurasGeometricas {
	
	private double perimeter;
	private double area;
	
	public FigurasGeometricas() {
		
	}

	// Constructor sobrecargado, con parámetros
	public FigurasGeometricas(double perimeter, double area) {
		
		this.perimeter = perimeter;
		this.area = area;
		
	}
	
	// Métodos accesores

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
}
