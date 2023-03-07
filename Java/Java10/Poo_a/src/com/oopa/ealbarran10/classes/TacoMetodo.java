package com.oopa.ealbarran10.classes;

public class TacoMetodo {
	
	Taco objTM = new Taco();
	
	public void prepararTaco() {
		System.out.println("Preparando taco de " + objTM.getGuisado() + ", con tortilla de " + objTM.getTortillaTipo());
	}

	public float venderTaco(int tortillaNumero) {
		float precio = tortillaNumero;
		return precio;
		
	}

	public void ponerSalsa() {
		System.out.println();
	}

	public void subirPrecio() {
		System.out.println();
	}

}
