package Testers;

import java.util.Date;

public class TestFecha {
	
	public static void main(String[] args) {
	
		Date objD = new Date();
		objD.setDate(6);
		objD.setMonth(3);
		objD.setYear(2003);
		
		System.out.println(objD.dayMonthYear)
	}

}
