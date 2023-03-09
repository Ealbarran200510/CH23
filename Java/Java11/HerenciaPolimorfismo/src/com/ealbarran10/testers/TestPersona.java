package com.ealbarran10.testers;

import com.ealbarran10.clases.PersonaB;
import com.ealbarran10.clases.PersonaP;

public class TestPersona {
	
	public static void main (String [] args) {
		
		PersonaB objPB = new PersonaB("Estudiante", 1234, "Mark", 17);
		System.out.println(objPB.getNombre());
		System.out.println(objPB.getEdad());
		System.out.println(objPB.getOcupación());
		System.out.println(objPB.getID());
		
		System.out.println(objPB.toString());
		
		PersonaP objPP = new PersonaP("Layla",23);
		System.out.println(objPP.toString());
		
		objPB.mostrarDatos("Wayne");
		
	}

}
