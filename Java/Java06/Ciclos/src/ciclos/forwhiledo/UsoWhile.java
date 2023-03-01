package ciclos.forwhiledo;

import java.util.Scanner;

public class UsoWhile {
	
	Scanner entrada = new Scanner(System.in);
	
	public void cicloW() {
		
		System.out.println("Ciclo While");
		
		int iterador = 0;
		
		while (iterador < 10) {
			
			System.out.println("Iterador" + iterador);
			
			iterador = iterador +1;
		}
		
	}
	
	public void centinelaW() {
		
		System.out.println("Ciclo While Centinela");
		
		final int centinela = -1;
		System.out.println("Introduzca una nota");
		
		int nota = entrada.nextInt();
		
		while (nota != centinela) {
			
			System.out.println("La nota es: " + nota);
			System.out.println("Introduzca una nota");
			nota = entrada.nextInt();
			
		}
		
		System.out.println("Fin");
		
	}
	
	/*
	public static double banderaW() {
		
		System.out.println("Método estático");
		Math.pow(2, 2);
		return 0.0;
		
	}
	
	*/
	
	public void banderaW() {
		
		System.out.println("Ciclo While Bandera");
		
		boolean valorb = false;
		
		while(!valorb) {
		
		System.out.println("Introduzca un numero");
		
		int valorx = entrada.nextInt();
		
		if(valorx > 0 && valorx < 5) {
			
			int p = (int) Math.pow(valorx, 2);
			System.out.println("El resultado --->" + p);
			
		}
		
	}

}}
