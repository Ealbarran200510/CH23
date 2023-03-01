package control;

import java.util.Scanner;

public class EstructuraIf {
	
	Scanner entrada = new Scanner (System.in);
	
	public void controlIf () {
		
		/*
		if (condición) {
			
		}
		*/
		
		long nota = 7;
		
		if (nota>5) {
			
			System.out.println("Aprobado: " + nota);
		}
		
		System.out.println("Continua el control de flujo");
		
		if (nota>=5) {
			
			System.out.println("Aprobado: " + nota);
		} else {
			
			System.out.println("No aprobado: " + nota);
			
		}
		
		System.out.println("Continua el control de flujo");
		
	}

	public void divisible() {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce un numero");
		int num1 = entrada.nextInt();
		System.out.println("Introduce un segundo numero");
		int num2 = entrada.nextInt();
		
		if (num1%num2==0) {
			
			System.out.println(num1 + " es divisible entre " + num2);
			
		} else {
			
			System.out.println(num1 + " no es divisible entre " + num2);
			
		}

	}
	
	public void compara() {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce un numero");
		int num3 = entrada.nextInt();
		System.out.println("Introduce un segundo numero");
		int num4 = entrada.nextInt();
		
		if (num3==num4) {
			
			System.out.println(num3 + " y " + num4 + " son iguales");
			
		} else {
			
			System.out.println(num3 + " y " + num4 + " no son iguales");
			
		}
		
		if (num3>num4) {
			
			System.out.println(num3 + " es mayor a " + num4 );
			
		} else {
			
			System.out.println(num3 + " es menor a " + num4 );
			
		}

	}
	
	public void anidado() {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce un numero");
		int num5 = entrada.nextInt();
		
		if (num5 > 0) {
			
			System.out.println("El numero " + num5 + " es positivo");
			
		} else if (num5 < 0){
			
			System.out.println("El numero " + num5 + " es negativo");
			
		} else {
			
			System.out.println("El numero es " + num5);
			
		}

	}
}
