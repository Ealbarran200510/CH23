package com.oopa.ealbarran10.classes;

public class Taco {
	
	private String tortillaTipo;
	private String guisado;
	private int tortillaNumero;
	private String tortillaTamano;
	private float tacoPrecio;
	
	public Taco () {
		
	}
	
	public Taco (String tortillaTipo, String guisado, int tortillaNumero,String tortillaTamano, float tacoPrecio) {
		
		this.tortillaTipo = tortillaTipo;
		this.guisado = guisado;
		this.tortillaNumero = tortillaNumero;
		this.tortillaTamano = tortillaTamano;
		this.tacoPrecio = tacoPrecio;
		
	}
	
	public String prepararTaco() {
		return guisado;

    }

    public String toString() {
        return ("El taco es de: " + guisado + ", con: " + tortillaNumero + " tortillas, de tamaño: " + tortillaTamano
                + ", y de tipo: " + tortillaTipo + ". Por lo que cuesta: " + tacoPrecio + " pejecoins");
    }

    public String getTortillaTipo() {
        return tortillaTipo;
    }

    public void setTortillaTipo(String tortillaTipo) {
        this.tortillaTipo = tortillaTipo;
    }

    public String getGuisado() {
        return guisado;
    }

    public void setGuisado(String guisado) {
        this.guisado = guisado;
    }
    
    public int getTortillaNumero() {
        return tortillaNumero;
    }

    public void setTortillaNumero(int tortillaNumero) {
        this.tortillaNumero = tortillaNumero;
    }

    public String tortillaTamano() {
        return tortillaTamano;
    }

    public void setTortillaTamano(String tortillaTamano) {
        this.tortillaTamano = tortillaTamano;
    }
    
    public float getTacoPrecio() {
        return tacoPrecio;
    }

    public void setTacoPrecio(float tacoPrecio) {
    	this.tacoPrecio = tacoPrecio;
    }
    
}
