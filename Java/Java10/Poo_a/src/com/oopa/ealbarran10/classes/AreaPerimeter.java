package com.oopa.ealbarran10.classes;

// Los cálculos se realizan en esta clase
public class AreaPerimeter {
	
	public double areaSquare (double side) {

		double area = side * side;
		return area;

	}
	
	public double perimeterSquare (double side) {

		double perimeter = 4 * side;
		return perimeter;

	}
	
	public double areaTriangle (int base, int height) {

		return (base * height) / 2;

	}
	
	public double perimeterTriangle (int base, double CO, double CA) {

		return (base + CO + CA);

	}
	
	public double areaRectangle (int base, int height) {

		return (base * height);

	}
	
	public double perimeterRectangle (int base, int height) {

		return (base + height) * 2;

	}
	
	public double areaCircle (double diameter) {

		return ((Math.PI) * Math.pow(diameter/2,2));

	}
	
	public double perimeterCircle (double diameter) {

		return ((Math.PI) * (diameter));

	}
	
	public double areaPentagon (double side, double a) {

		return ((side) * 5) * (a);

	}
	
	public double perimeterPentagon (double side) {

		return (side) * 5;

	}


}
