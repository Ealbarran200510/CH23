package Funciones;

public class Funciones {
	
	/*

	Funciones 

	    - No retornan valores: No devuelven nada, no se especifica nada, y no usamos la palabra return
	    
	    - Si retornan valores: Se especifica el tipo de dato, el tipo de valor que regresa y se usa return para esto

		- Sintaxis de las funciones que si retornan valores
		
    	tipoDeRetorno nombreDeLaFuncion(tipoDeDato argumento1, tipoDeDato argumento2, ...) {
  
  		Cuerpo de la función
  		
}

    	- Sintaxis de las funciones que no retornan valores
    	palabraReservada nombreDeLaFuncion(){
    	
    	Cuerpo de la funcion
     }
     
     Cosas que debemos tomar en cuenta al momento de crear nuestras funciones:
    - Deben de llevar un nombre unico
    - Opcionalmente podran recibir argumentos y devolver el resultado
    - Se debe especificar el tipo de dato que vamos a pasar como argumnto, y el resultado final de nuestra funcion
    - Cuidar el orden en como estamos agregando nuestros parametros o argumentos.
    
		
		// Las funciones se puden declarar en cualquier lugar de la clase
		
	    public static int sumar (int num1, int num2) {
	    	
	        int resultado = num1 + num2;
	        return resultado;
	        
	    } // Cierre suma
	    
	    */
	    
	    // Función par imprimir asteriscos (tipo void)
	    
	    public static void imprimirAsteriscos() {
	    	
	    	System.out.println("**********");
	    
	    } // Cierre imprimir
	    
	    // Función que combina distintos tipos de valores
	    
	    public static float sumaDecimal (float valor1, int valor2) {
	    	
	    	float resultadoDecimal = valor1 + valor2;
	    	return resultadoDecimal;
	    }
	    
	    // Función que usa Strings como argumentos
	    
	    public static String aguaDeLimón (String ingrediente1, String ingrediente2, String ingrediente3) {
	    	
	    	String recetaCompleta = ingrediente1 + ingrediente2 + ingrediente3;
	    	return recetaCompleta;
	    }
	    
	    // Este método tiene como función ejecutar cosas
	    
	    public static void main (String [] args) {
	    	
	    	// Las invocaciones de la función generalmente se hacen dentro del método principal o main
	    	
	    	System.out.println("El resultado de la suma es: " + sumar(5,8));
	    	
	    	imprimirAsteriscos();
	    	
	    	System.out.println("El resultado de la suma decimal es: " + sumaDecimal(5.7f,17));
	    	
	    	System.out.println("Pasos para preparar agua de limón:" + aguaDeLimón("agua", "limón", "azúcar"));
	    
	    	// Funciones de la biblioteca Math
		    
		    double valorEjemplo = 7.65497834d;
		    		
		    System.out.println("La raíz cuadrada de mi valor es: " + 
		    		Math.sqrt(valorEjemplo));
		    
		    System.out.println("La raíz cuadrada de mi valor es: " + 
		    		Math.sin(valorEjemplo));
		    
		    System.out.println("La raíz cuadrada de mi valor es: " + 
				    Math.pow(valorEjemplo, 2));
		    
		    double distancia = 100; // Distancia entre la persona y la torre
		    double ánguloElevaciónTorre = 30; // Ángulo de elevación de la torre
		    double ánguloTorre = 90; // Ángulo de la torre en grados
		    
		    float tangente = (float) Math.tan(ánguloElevaciónTorre);

		    double altura = 
		    		distancia * Math.tan(Math.toRadians(ánguloElevaciónTorre)); // Calculandor altura de la torre

		    System.out.println("La distancia del observador a la torre son: " + distancia + " metros. (Base del triángulo)");
		    System.out.println("El ángulo de elevación de la torre son: " + ánguloElevaciónTorre + " grados.");
		    System.out.println("La torre es recta, por lo tanto su ángulo es de: " + ánguloTorre + " grados.");
		    System.out.println("La altura de la torre es de " + altura + " metros. (Áltura del triángulo)");

	    
	    } // Cierre main
	    
	    
	    public static int sumar (int num1, int num2) {
	    	
	        int resultado = num1 + num2;
	        return resultado;
	        
	    } // Cierre suma

	    public static int restar (int num1, int num2) {
	
	    	int resultado = num1 - num2;
	    	return resultado;
    
	    } // Cierre resta

	    public static int mult (int num1, int num2) {
	
	    	int resultado = num1 * num2;
	    	return resultado;
    
	    } // Cierre multiplicar

	    public static int div (int num1, int num2) {
	
	    	int resultado = num1 / num2;
	    	return resultado;
    
	    } // Cierre dividir
	    
}
