package com.oopa.ealbarran10.main;

import com.oopa.ealbarran10.classes.Taco;
import com.oopa.ealbarran10.classes.TacoMetodo;

public class TestTaco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Taco objT = new Taco();
		TacoMetodo objTM = new TacoMetodo();
		
		objT.setGuisado("Pollo en salsa roja");
		objT.setTortillaNumero(2);
		objT.setTortillaTamano("normal");
		objT.setTortillaTipo("harina");
		objT.setTacoPrecio(45);
		
		System.out.println(objT.toString());
		
		System.out.print("El precio de " + objT.getTortillaNumero() + " tacos de "+ objT.getGuisado() + ", con tortilla de " + objT.getTortillaTipo() + " es de: " + objTM.venderTaco(2) + " pejecoins");
		
		
		Taco objT2 = new Taco();
		
		objT2.setGuisado("Cochinita Pibil");
		objT2.setTortillaNumero(1);
		objT2.setTortillaTamano("grande");
		objT2.setTortillaTipo("maiz");
		objT2.setTacoPrecio(40);
		
		System.out.println(objT2.toString());

	}

}
