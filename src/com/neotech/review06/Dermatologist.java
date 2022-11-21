package com.neotech.review06;

public class Dermatologist extends Doctor {

	String dermId;
	
	//defualt
	public Dermatologist() {
		//super();
		//implicitly it is calling the default constructor of the parent class
		
		
		
	}
		//the constructors are NOT inherited from the parent class
		public Dermatologist(String name, int salary, String licenseId)
		
		{
			//you an use this. but it's better to use super
			//we use super only in inheritance 
			//super.name= name;
			//super.salary = salary;
			//super.licenseId = licenseId;
			
			super(name, salary, licenseId);
		}
		
		public Dermatologist(String name, int salary, String licenseId, String dermId)
		{
			//super.name = name;
			//super.salary = salary;
			//super.licenseId = licenseId;
			super(name, salary, licenseId);
			this.dermId =dermId; //using this. because dermId is declared in this class not in the parent calss
		}
		
		
		
		
		
		public void applySkinTreatment()
		{
			System.out.println("Doctor " + name + " applies skin treatment");
		}
		
		
		
		
		
		
		
		
		}
	

