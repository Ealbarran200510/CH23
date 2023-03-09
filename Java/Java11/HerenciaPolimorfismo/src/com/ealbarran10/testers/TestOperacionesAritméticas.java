package com.ealbarran10.testers;

import com.ealbarran10.clases.Mensajes;
import com.ealbarran10.clases.OperacionesAritméticas;
import com.ealbarran10.clases.Suma;

public class TestOperacionesAritméticas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Suma objS = new Suma (5,5);
		
		OperacionesAritméticas objSS = new Suma(10,10);
		
		Mensajes objSSS = new Suma();
		
		System.out.println(objS.sumar());
		System.out.println(objSS.sumar());
		
		objS.mensaje();
		objSSS.mensaje();

	}

}
