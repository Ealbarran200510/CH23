package com.oopa.ealbarran10.manejoExcepciones;

import java.util.Scanner;

public class ExcepcionesNoComprobadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner dato = new Scanner (System.in);
		System.out.println("Introduce un valor");
		
		int divisor;
		
		divisor = Integer.parseInt(dato.next());
		
		try {
			
			int division = 10/0;
			System.out.println(division);
			
			
		} catch (Exception e) {
			
			System.out.println("Capturando excepción" + e.getMessage());
			
		} finally {
			
			System.out.println("Bloque opcional, se ejecuta con o sin la excepción");
			
		}

	}

}
