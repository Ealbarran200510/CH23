package Colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		wrapperClass();
		MyCollection objC = new MyCollection();
		objC.listCollection();
		imprimir(objC.listCollection());
		
		objC.mapCollection();

	}
	
	static void wrapperClass () {
		
		byte numeroA = -128;
		
		System.out.println("Tamaño de un byte " + Byte.SIZE);
		System.out.println("Valor máximo " + Byte.MAX_VALUE);
		System.out.println("Valor mínimo " + Byte.MIN_VALUE);
		System.out.println("-----> " + numeroA);
		
		int numeroB = -2147483648;
				
		System.out.println("Tamaño de un entero en bytes " + Integer.BYTES);
		System.out.println("Tamaño de un entero " + Integer.SIZE);
		System.out.println("Valor máximo " + Integer.MAX_VALUE);
		System.out.println("Valor mínimo " + Integer.MIN_VALUE);
		System.out.println("-----> " + numeroB);
		
		Short numeroC = -32765;
		
		System.out.println("Tamaño de un entero en bytes " + Short.BYTES);
		System.out.println("Tamaño de un entero " + Short.SIZE);
		System.out.println("Valor máximo " + Short.MAX_VALUE);
		System.out.println("Valor mínimo " + Short.MIN_VALUE);
		System.out.println("-----> " + numeroC);
		
		Long numeroD = (long) 2145483647;
		
		System.out.println("Tamaño de un entero en bytes " + Long.BYTES);
		System.out.println("Tamaño de un entero " + Long.SIZE);
		System.out.println("Valor máximo " + Long.MAX_VALUE);
		System.out.println("Valor mínimo " + Long.MIN_VALUE);
		System.out.println("-----> " + numeroD);
		
		Float numeroE = (float) 3.3111111E38;
		
		System.out.println("Tamaño de un entero en bytes " + Float.BYTES);
		System.out.println("Tamaño de un entero " + Float.SIZE);
		System.out.println("Valor máximo " + Float.MAX_VALUE);
		System.out.println("Valor mínimo " + Float.MIN_VALUE);
		System.out.println("-----> " + numeroE);
		
		Double numeroF = 1.6E307;
		System.out.println("Tamaño de un entero en bytes " + Double.BYTES);
		System.out.println("Tamaño de un entero " + Double.SIZE);
		System.out.println("Valor máximo " + Double.MAX_VALUE);
		System.out.println("Valor mínimo " + Double.MIN_VALUE);
		System.out.println("-----> " + numeroC);
	}
	
	public List listCollection () {
		
		List myList = new ArrayList();
		
		System.out.println(myList + "Tamaño de la lista antes " + myList.size());
		System.out.println("Está vacía " + myList.isEmpty());
		
		myList.add("1");
		myList.add(2);
		myList.add(3);
		myList.add(0,"Pato");
		
		myList.set(0,myList);
		
		System.out.println(myList + "Tamaño de la lista después " + myList.size());
		System.out.println("Está vacía " + myList.isEmpty());
		
		return myList;
		
	}
	
	private static void imprimir (Collection collection) {
		
		for (Object elementos:collection) {
			
			System.out.println("Elementos " + elementos);
		}
		
	}
	
	Set setCollections() {
		
		Set miSet = new HashSet();
		miSet.add("Uno");
		miSet.add("Dos");
		miSet.add("Tres");
		miSet.add("Cuatro");
		miSet.add("Cinco");
		
		miSet.clear();
		miSet.size();
		
		return miSet;
		
	}
	
	private static void mapCollection() {
		
		Map miMap = new HashMap();
		
		miMap.put("Valor 1", "John");
		miMap.put("Valor 2", "Mary");
		miMap.put("Valor 3", "Ains");
		miMap.put("Valor 4", "Karl");
		
		
		miMap.remove("Valor 3");
		
		imprimir(miMap.values());
	}

}
