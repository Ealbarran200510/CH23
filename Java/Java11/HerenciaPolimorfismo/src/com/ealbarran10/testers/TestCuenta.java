package com.ealbarran10.testers;

import com.ealbarran10.clases.CuentaAhorros;

public class TestCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CuentaAhorros cuentaAhorros = new CuentaAhorros(10000, 0.10);

	    cuentaAhorros.consignar(5000);
	    cuentaAhorros.retirar(7000);
	    cuentaAhorros.calcularInteres();
	    cuentaAhorros.extractoMensual();
	    cuentaAhorros.imprimir();

	}

}
