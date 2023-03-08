package com.oopa.ealbarran10.manejoExcepciones;

public class División {
	
	private int numerador;
	private int denominador;
	
	
	public División(int numerador, int denominador) throws OperaciónExcepción {
		
		if (denominador == 0) {
			
			throw new OperaciónExcepción ("El denominador es cero");
			
		}
		
		this.numerador = numerador;
		this.denominador = denominador;
		
		}
	
	public void visualizarDivisión () {
		
		System.out.println("El resultado de la división es: " + (this.numerador/this.denominador));
		
	}
	
	
	
	

}
