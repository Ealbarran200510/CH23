package com.oopa.ealbarran10.manejoExcepciones;

public class TestExcepción {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			División objD = new División (4,2);
			
		} catch (OperaciónExcepción e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		

	}

}
