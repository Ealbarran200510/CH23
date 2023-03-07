package com.oopa.ealbarran10.classes;

public class Person {
	
	private String name;
	private int age;
	private int nss;
	
	
	public Person () {
		
	}
	public Person (String name, int age, int nss) {
		
		this.name = name;
		this.age = age;
		this.nss = nss;
		
	}
	
	public String getName () {
		
		return name;
		
	}
	
	public void setName (String name) {
		
		this.name = name;
		
	}
	
public int getAge () {
		
		return age;
		
	}
	
	public void setAge (int age) {
		
		this.age = age;
		
	}
	
public int getNss () {
		
		return nss;
		
	}
	
	public void setNss (int nss) {
		
		this.nss = nss;
		
	}

}
