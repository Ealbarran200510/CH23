package com.ealbarran10.clases;

public class CuentaCorriente extends Cuenta{
	
	private float sobregiro;
	
	public CuentaCorriente (float saldo, float tasaAnual) {
		
		super(saldo,tasaAnual);
		this.sobregiro = 0;
		
	}
	
    public void retirar(float cantidad) {
        if (cantidad <= saldo + sobregiro) {
            if (saldo >= cantidad) {
                saldo -= cantidad;
            } else {
                sobregiro -= cantidad - saldo;
                saldo = 0;
            }
            numeroDepositos++;
        } else {
            System.out.println("No hay suficiente saldo y sobregiro para realizar el retiro.");
        }
    }
    
    public void consignar(float cantidad) {
        super.consignar(cantidad);
        if (sobregiro > 0) {
            if (cantidad >= sobregiro) {
                saldo += cantidad - sobregiro;
                sobregiro = 0;
            } else {
                sobregiro -= cantidad;
            }
        }
    }
    
    public void extractoMensual() {
        if (numeroRetiros > 4) {
            comisionMensual += (numeroRetiros - 4) * 1000;
        }
        super.extractoMensual();
    }
    
    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Comisión mensual: " + comisionMensual);
        System.out.println("Número de transacciones: " + (numeroDepositos + numeroRetiros));
        System.out.println("Sobregiro: " + sobregiro);
    }

}
