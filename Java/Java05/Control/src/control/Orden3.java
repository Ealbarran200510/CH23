package control;

import java.util.Scanner;

public class Orden3 {
	
	Scanner data1 = new Scanner (System.in);
	
	public void orden (String[] args) {
		
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 7));

        Collections.sort(lista);

        System.out.println("Lista ordenada de menor a mayor: " + lista);
        
    }

}
