package pruebasJUnit.ealbarran10.app;

public class Calculadora {
	
	public int sumar (int n1, int n2) {
		
		return n1 + n2;
	}
	
	public int restar (int n1, int n2) {
		
		return n1 - n2;
	}

	public int mult (int n1, int n2) {
	
	return n1 * n2;
	}

	public double div (double n3, double n4) {
	
	return n3 / n4;
	
	}
	
	public double divCero (double n5, double n6) {
		
		if (n6 == 0) {
			
			throw new ArithmeticException ("No es posible dividir entre 0");
		}
		
		return (n5 / n6);
		
	}

}
