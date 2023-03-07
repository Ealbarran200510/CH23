package Testers;

import Clases.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona objP = new Persona();
		objP.setName("Mary");
		System.out.println(objP.getName());
		
		Persona objP0 = new Persona("Jos");
		System.out.println(objP.getName());
		
		Persona objP1 = new Persona("Tyrek");
		System.out.println(objP.getName());
		
	}

}
