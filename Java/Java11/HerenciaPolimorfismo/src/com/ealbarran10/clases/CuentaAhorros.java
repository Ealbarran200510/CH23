package com.ealbarran10.clases;

public class CuentaAhorros extends Cuenta {
	
	private boolean activa;
	
	public CuentaAhorros (float saldo, double tasaAnual) {
		
		super(saldo, tasaAnual);
		
		if (saldo < 10000) {
			
			activa = false;
			
		}else {
			
			activa = true;
		}
	}
	
    @Override
    public void consignar(float cantidad) {
        if (activa) {
            super.consignar(cantidad);
        } else {
            System.out.println("La cuenta de ahorros está inactiva. No se puede consignar dinero.");
        }
    }
    
    @Override
    public void retirar(float cantidad) {
        if (activa) {
            super.retirar(cantidad);
        } else {
            System.out.println("La cuenta de ahorros está inactiva. No se puede retirar dinero.");
        }
    }
    
    @Override
    public void extractoMensual() {
        if (activa) {
            super.extractoMensual();
            if (getNumeroDepositos() > 4) {
                setComisionMensual(getComisionMensual() + (getNumeroRetiros() - 4) * 1000);
            }
        } else {
            System.out.println("La cuenta de ahorros está inactiva. No se puede generar el extracto mensual.");
        }
    }
    
    public void imprimir() {
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Comisión mensual: " + getComisionMensual());
        System.out.println("Número de transacciones: " + (getNumeroDepositos() + getNumeroRetiros()));
    }
}
