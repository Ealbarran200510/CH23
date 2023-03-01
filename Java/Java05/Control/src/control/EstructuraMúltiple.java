package control;

import java.util.Scanner;

public class EstructuraMúltiple {
	
	Scanner data = new Scanner(System.in);
	
	public void vocal() {
		// TODO Auto-generated method stub

		System.out.println("Introduce una letra");
		
		char letra = data.next().charAt(0);
		
		switch (letra) {
		
		case "A": 
		case "a":
		case "E":
		case "e":
		case "I":
		case "i": 
		case "O":
		case "o":
		case "U":
		case "u":
			
			System.out.println("La letra es vocal");
			break;
			
			default:
				System.out.println("La letra no es vocal");
				break;
		}
		
	}
	
	public void notas() {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce la nota");
		
		int nota = data.nextInt();
		
		switch (nota) {
		
		case "10": 
		case "9":
		case "8":
		case "7":
		case "6":
		case "5": 
		case "4":
		case "3":
		case "2":
		case "1":
		case "0": System.out.println("Reprobado");
		
		break;
		
		default:
			System.out.println("Nota no válida");
			break;

		}
	}
	
	private void ternario() {
		// TODO Auto-generated method stub
		
		System.out.println("Introduzca un valor");
		int entradaV = data.nextInt();
		
		System.out.println("Introduzca otro valor");
		int entradaF = data.nextInt();
		
		int menor = (entradaV <= entradaF ? entradaV : entradaF);
		System.out.println("--------> " + menor);

	}
}
