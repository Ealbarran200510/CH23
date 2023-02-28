package Java04;

public class Java04 {
	
	public static void main(String[] args) {
		
		int edad = 18;
		boolean tieneLicencia = true;
		if (edad >= 18 && tieneLicencia) {
		    System.out.println("Puede conducir un coche");
		} else {
		    System.out.println("No puede conducir un coche");
		}
		
		String nombre = "Juan";
		String apellido = "Pérez";
		if (nombre.equals("Juan") || apellido.equals("Pérez")) {
		    System.out.println("El usuario es Juan Pérez");
		} else {
		    System.out.println("El usuario no es Juan Pérez");
		}
		
		boolean esVerdadero = true;
		if (!esVerdadero) {
		    System.out.println("La condición es falsa");
		} else {
		    System.out.println("La condición es verdadera");
		}
		
		/*
		 
    ¿Es un número positivo y menor que 10?

java

int numero = 7;
boolean esPositivoYMenorQue10 = numero > 0 && numero < 10;
System.out.println(esPositivoYMenorQue10); // salida: true

En este ejemplo, se tiene una variable numero de tipo int que contiene el valor 7. La variable esPositivoYMenorQue10 utiliza los operadores lógicos && (AND) para evaluar si el número es mayor que cero y menor que 10. Como ambas condiciones se cumplen, la respuesta es true.

    ¿Es un número par o múltiplo de 3?

java

int numero = 9;
boolean esParOMultiploDe3 = numero % 2 == 0 || numero % 3 == 0;
System.out.println(esParOMultiploDe3); // salida: true

En este ejemplo, se tiene una variable numero de tipo int que contiene el valor 9. La variable esParOMultiploDe3 utiliza los operadores lógicos || (OR) para evaluar si el número es par o múltiplo de 3. Para determinar si es par, se utiliza el operador % (módulo) para obtener el resto de la división entre el número y 2. Si el resto es cero, significa que el número es par. Para determinar si es múltiplo de 3, se utiliza el operador % para obtener el resto de la división entre el número y 3. Si el resto es cero, significa que el número es múltiplo de 3. Como el número 9 es múltiplo de 3, la respuesta es true.

    ¿Es un número negativo o igual a cero?

java

int numero = 0;
boolean esNegativoOIgualACero = numero <= 0;
System.out.println(esNegativoOIgualACero); // salida: true

En este ejemplo, se tiene una variable numero de tipo int que contiene el valor 0. La variable esNegativoOIgualACero utiliza el operador lógico <= (menor o igual que) para evaluar si el número es negativo o igual a cero. Como el número es igual a cero, la respuesta es true.
		 */
		
		//Verificar si un número es par y positivo:
		
		int numero = 64;
		
		boolean esParYPositivo = numero > 0 && numero % 2 == 0;

		if (esParYPositivo) {
			System.out.println("El numero es par y positivo");
		} else {
			System.out.println("No se cumplen las condiciones");
		}
		
		// Verificar si un número está dentro de un rango específico
		
		int numero2 = 22;
		
		boolean rango = numero2 > 0 && numero2 < 20;
		if (rango) {
			System.out.println("El numero está dentro del rango");
		} else {
			System.out.println("El numero está fuera del rango");
		}
		
		String cadena1 = "Hola";
		String cadena2 = "Hola.";
		
		boolean eq = cadena1 == cadena2;

		if (eq) {
			System.out.println("Las cadenas son iguales");
		} else {
			System.out.println("Las cadenas son diferentes");
		}

	}

}
