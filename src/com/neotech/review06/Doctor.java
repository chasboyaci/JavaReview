package com.neotech.review06;



//OOP --> Object Oriented Programming 
//1. Inheritance
//2. PolyMorphish
//3. Abstraction
//4. Encapsulation 


//every class is extended from the object class
//object class is like Adam in humanity
public class Doctor  { 

	//defining the structure of the doctor
	
	//instance variables
	String name;
	int salary;
	String licenseId;
	
	//having a default constructor helps the inheritance classes. it is a good practice to do this
	Doctor(){
		
	}
	
	
	//constructor
	//to set the parameters of the instant variables
	Doctor(String name, int salary, String licenseId)
	{
		this.name = name;
		this.salary = salary;
		this.licenseId = licenseId;
		
		
	}
	
	//this is a method that you can everything
	public void checkUp(String patientName)
	{
		System.out.println("Doctor " + name + " makes a checkup on " + patientName);
	}
	
	
	
}
