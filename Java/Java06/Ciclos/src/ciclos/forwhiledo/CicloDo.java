package ciclos.forwhiledo;

import java.util.Scanner;

public class CicloDo {
	
	Scanner digito = new Scanner(System.in);
	
	public void digitosDo() {
		
		int valor = 0;
		int acumulador = 0;
		
		do {
		
		System.out.println("Introduce un numero entre 0 y 9");
		
		valor = digito.nextInt();
		acumulador = acumulador + valor;
		
		System.out.println("----->" + acumulador);
		
	
		} while (valor >=0 && valor <=9);
		
		System.out.println("Bye");
		
	}

}
