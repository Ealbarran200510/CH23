package pruebasJUnit.ealbarran10.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import pruebasJUnit.ealbarran10.app.Calculadora;

class CalculadoraTest {
	
	public void Before () {
		
		objCT = new Calculadora ();
		System.out.println("Ejecutando before");
		
	}
	
	private Calculadora objCT;

	@Test
	public void calculadoraNull() {
		
		assertNull(objCT, "La clase es una instancia no nula");
		System.out.println("Ejecutando primer test");
		
	}
	
	@Test
	public void calculadoraNotNull() {
		
		assertNotNull(objCT);
		
	}
	
	
	@AfterEach
	public void After () {
		
		objCT = null;
		System.out.println("Ejecutando After Each");
		System.out.println("*");
		
	}
	
	/* Primeras pruebas */
	
	public void primerAssert () {
		
		/* 1. Qué se va a evaluar
		 	2. Acciones a realizar
		 	3. Evaluar con assert
		 */
		
		/* 1. objCT = new Calculadora (); La instancia ya existe */
		
		int resultadoEsperado = 10;
		int resultado;
		
		resultado = objCT.sumar(7,3);
		assertEquals(resultadoEsperado, resultado);
		System.out.println("Tercer test");
		
	}
	
	@Test
	public void sumaTest () {
		
		Calculadora calculadora = new Calculadora ();
		assertEquals(20,calculadora.sumar(10, 10));
		System.out.println("Cuarto test");
		
	}
	
	/* Tipos test */
	
	public void tiposAsserts () {
		
		assertTrue(1 == 2);
		assertEquals("A", "A");
		assertNull(objCT);
		
		Calculadora C1 = new Calculadora ();
		Calculadora C2 = new Calculadora ();
		Calculadora C3 = C1;
		
		assertSame(C1, C3);
		assertNotSame(C2, C3);
		assertEquals(1, 1.5, 0.5);
		
	}
	
	public void validarSuma () {
		
		assertEquals(11, objCT.sumar(5, 6));
	}
	
	public void validarResta () {
		
		assertEquals(-10, objCT.restar(21, 6));
	}
	
	public void validarMult () {
		
		assertEquals(11, objCT.mult(5, 6));
	}
	
	public void validarDiv () {
		
		assertEquals(11, objCT.div(5, 6));
	}
	
	public void validarDivCero () {
		
		assertThrows(ArithmeticException.class, () -> objCT.divCero(10, 0), "No es posible dividir entre cero");
	}
	
	@Disabled("En espera");

}
