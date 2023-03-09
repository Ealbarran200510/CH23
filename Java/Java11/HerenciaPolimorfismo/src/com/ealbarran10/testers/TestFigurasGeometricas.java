package com.ealbarran10.testers;

import com.ealbarran10.clases.Círculo;
import com.ealbarran10.clases.FigurasGeometricas;
import com.ealbarran10.clases.Pentágono;
import com.ealbarran10.clases.Rectángulo;

public class TestFigurasGeometricas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FigurasGeometricas rectángulo = new Rectángulo (2,5);
		
		FigurasGeometricas cuadrado = new Rectángulo (5,5);
		
		FigurasGeometricas triángulo = new Rectángulo (4,3);
		
		FigurasGeometricas círculo = new Círculo (2);
		
		FigurasGeometricas pentágono = new Pentágono (25,3);
		
		
		System.out.println(rectángulo.toString());
		System.out.println("Area del rectángulo: " + rectángulo.areas());
		
		System.out.println("Area del cuadrado: " + cuadrado.areas());
		
		System.out.println("Area del triángulo: " + (triángulo.areas()/2));
		
		System.out.println(círculo.toString());
		System.out.println("Area del círculo: " + círculo.areas());
		
		System.out.println(pentágono.toString());
		System.out.println("Area del pentágono: " + pentágono.areas());
		
		rectángulo.pedirDatos();
		System.out.println(rectángulo.toString());
		System.out.println(rectángulo.areas());

	}

}
