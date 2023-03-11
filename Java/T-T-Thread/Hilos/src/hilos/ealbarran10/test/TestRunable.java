package hilos.ealbarran10.test;

import hilos.ealbarran10.formarunable.Hilo2;

public class TestRunable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hilo2 objHT = new Hilo2("Pedro");
		Thread objST = new Thread (objHT);
		objST.start();
		
		new Thread (new Hilo2("Charles").start());
		new Thread (new Hilo2("Mark").start());

	}

}
