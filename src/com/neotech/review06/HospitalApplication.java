package com.neotech.review06;

public class HospitalApplication {

	public static void main(String[] args) {
		
		Doctor d1 = new Doctor("Karen", 170000, "D123");
		d1.checkUp("Emine");
		
		
		//Can't use these because its in the child class not in the parent class
		//d1.applySkinTreatment(); 
		//d1.dermId ="X";
		
		
		//Creating a Derm with No intital information
		Dermatologist d2 = new Dermatologist();
		d2.name = "Alex";
		d2.salary = 500000;
		d2.licenseId = "D555";
		d2.dermId = "X987";
		
		d2.checkUp("Dardan");
		d2.applySkinTreatment();
		
		System.out.println("______________________________");
		
		
		//Creating a Derm with 3 parameters 
		Dermatologist d3 = new Dermatologist("Karen", 190000, "D482");
		d3.dermId = "X284";
		d3.salary = 210000; //we are assigning the salary
		d3.applySkinTreatment();
		
		
		
		//Creatin a Derm with 4 paramters
		Dermatologist d4 = new Dermatologist("Jennifer", 350000, "D195", "X951");
		d4.checkUp("Emine");
		d4.applySkinTreatment();
		
		
		
		
		
		
		
	}
	
	
	
}
