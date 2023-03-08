package com.ealbarran10.clases;

public class PersonaB extends PersonaP {
	
	private String ocupación;
	private int ID;
	
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
	
	

}
