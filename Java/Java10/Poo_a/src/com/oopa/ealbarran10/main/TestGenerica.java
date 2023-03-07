package com.oopa.ealbarran10.main;

import com.oopa.ealbarran10.classes.ClaseGenerica;

public class TestGenerica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClaseGenerica <Integer> intObj = new ClaseGenerica <Integer> (55);
		ClaseGenerica <String> caracteresObj = new ClaseGenerica <String> ("Prueba");
		
		intObj.claseTipo();
		caracteresObj.claseTipo();
		
	}

}
