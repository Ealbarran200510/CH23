package com.ealbarran10.clases;

public class PersonaB extends PersonaP {
	
	private String ocupación;
	private int ID;
	
	public PersonaB (String ocupación, int ID, String nombre, int edad) {
		
		super (nombre,edad);
		this.ocupación = ocupación;
		this.ID = ID;
	}
	
	public String getOcupación() {
		return ocupación;
	}
	public void setOcupación(String ocupación) {
		this.ocupación = ocupación;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	@Override
	public String toString() {
		return "PersonaB [ocupación=" + ocupación + ", ID=" + ID + "]";
	}
	
	public void mostrarDatos () {
		System.out.println(this.getNombre() + " " + this.getEdad() + " " + this.getOcupación() + " " + this.getID());
	}
	
	public void mostrarDatos (String apellido) {
		System.out.println(this.getNombre() + " " + apellido + " " + this.getEdad() + " " + this.getOcupación() + " " + this.getID());
	}

}
