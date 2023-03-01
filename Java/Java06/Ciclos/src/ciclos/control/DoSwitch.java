package ciclos.control;

import java.util.Scanner;

import ciclos.forwhiledo.CicloDo;
import ciclos.forwhiledo.UsoFor;
import ciclos.forwhiledo.UsoWhile;

public class DoSwitch {
	
	public void controlador() {
		
		Scanner opcion = new Scanner(System.in);
		
		Menu objMP = new Menu();
		
		UsoWhile objUW = new UsoWhile();
		UsoFor objUF = new UsoFor();
		CicloDo objCD = new CicloDo();
		
		int opc = opcion.nextInt();
		
		do {
			
			objMP.menuPrincipal();
			
			System.out.print("Elige una opción");
			
			opc = opcion.nextInt();
			
			switch(opc) {
			
			case 1:
				objUW.cicloW();
				break;
			case 2:
				objUW.centinelaW();
				break;
			case 3:
				objUW.banderaW();
				break;
			case 4:
				objUF.cicloFor();
				break;
			case 5:
				objUF.letrasFor();
				break;
			case 6:
				objCD.digitosDo();
				break;
			default:
				break;
			
			}
			
		} while (opc > 0 && opc < 7);
		
		System.out.println("Fin");
		
	}

}
