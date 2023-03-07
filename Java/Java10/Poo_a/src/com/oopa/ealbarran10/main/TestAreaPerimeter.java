package com.oopa.ealbarran10.main;

import com.oopa.ealbarran10.classes.AreaPerimeter;
import com.oopa.ealbarran10.classes.FigurasGeometricas;

public class TestAreaPerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AreaPerimeter objAP = new AreaPerimeter ();
		FigurasGeometricas objFG = new FigurasGeometricas ();
		
		objFG.setArea(objAP.areaSquare(5));
		System.out.println("Area del cuadrado = " + objFG.getArea());
		objFG.setPerimeter(objAP.perimeterSquare(5));
		System.out.println("Perímetro del cuadrado = " + objFG.getPerimeter());
		
		objFG.setArea(objAP.areaTriangle(10,5));
		System.out.println("Area del triángulo = " + objFG.getArea());
		objFG.setPerimeter(objAP.perimeterTriangle(10,5,6));
		System.out.println("Perímetro del triángulo = " + objFG.getPerimeter());
		
		objFG.setArea(objAP.areaRectangle(10,5));
		System.out.println("Area del rectángulo = " + objFG.getArea());
		objFG.setPerimeter(objAP.perimeterRectangle(10,5));
		System.out.println("Perímetro del rectángulo = " + objFG.getPerimeter());
		
		objFG.setArea(objAP.areaCircle(5));
		System.out.println("Area del círculo = " + objFG.getArea());
		objFG.setPerimeter(objAP.perimeterCircle(5));
		System.out.println("Perímetro del círculo = " + objFG.getPerimeter());
		
		objFG.setArea(objAP.areaPentagon(5,3));
		System.out.println("Area del pentágono = " + objFG.getArea());
		objFG.setPerimeter(objAP.perimeterPentagon(5));
		System.out.println("Perímetro del pentágono = " + objFG.getPerimeter());
		
	}

}
