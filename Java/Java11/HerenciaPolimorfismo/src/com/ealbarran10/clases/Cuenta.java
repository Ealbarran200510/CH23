package com.ealbarran10.clases;

public class Cuenta {

	protected float saldo;
	protected  int numeroDepositos;
	protected  int numeroRetiros;
	protected  float tasaAnual;
	protected  float comisionMensual;
	
	public Cuenta(float saldo, double tasaAnual) {
		
        this.saldo = saldo;
        this.numeroDepositos = 0;
        this.numeroRetiros = 0;
        this.tasaAnual = (float) tasaAnual;
        this.comisionMensual = 0;
        
    }
	
	public void consignar (float cantidad) {
		
		saldo = (cantidad + saldo);
		numeroDepositos++;
		
	}
	
	public void retirar (float cantidad) {
		
		if (cantidad <= saldo) {
			saldo = cantidad - saldo;
			numeroRetiros++;
			
		} else {
			
			System.out.println("Saldo insuficiente");
		}
			
	}
	
	public void calcularInteres () {
		
		float interes = (saldo * (tasaAnual / 12));
		saldo = (saldo + interes);
	}
	
	public void extractoMensual () {
		
		saldo = (saldo - comisionMensual);
	}
	
	public void mostrar () {
		
		System.out.println("Saldo = " + saldo);
		System.out.println("Tasa anual = " + tasaAnual);
		System.out.println("Comisión mensual = " + comisionMensual);
		System.out.println("Numero de depósitos = " + numeroDepositos);
		System.out.println("Numero de retiros = " + numeroRetiros);
		
	}
	
	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getNumeroDepositos() {
		return numeroDepositos;
	}

	public void setNumeroDepositos(int numeroDepositos) {
		this.numeroDepositos = numeroDepositos;
	}

	public int getNumeroRetiros() {
		return numeroRetiros;
	}

	public void setNumeroRetiros(int numeroRetiros) {
		this.numeroRetiros = numeroRetiros;
	}

	public float getTasaAnual() {
		return tasaAnual;
	}

	public void setTasaAnual(float tasaAnual) {
		this.tasaAnual = tasaAnual;
	}

	public float getComisionMensual() {
		return comisionMensual;
	}

	public void setComisionMensual(float comisionMensual) {
		this.comisionMensual = comisionMensual;
	}

}
