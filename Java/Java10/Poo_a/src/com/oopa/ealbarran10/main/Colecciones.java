package com.oopa.ealbarran10.main;

import java.util.ArrayList;

public class Colecciones {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Interfaz: tipo de clase abstracta
		// Colección de métodos abstractos y propiedades constantes
		// Los métodos solo se declaran
		
		ArrayList <String> collection = new ArrayList <String> ();
		
		collection.add("colecciones");
		
		/*
		collection.add("collection");
		collection.add(13);
		collection.add(15.15);
		collection.add("a");
		*/
		
		for ( int i = 0; i < collection.size(); i++) {
			System.out.println(collection.get(i));
		}
		
	}

}
