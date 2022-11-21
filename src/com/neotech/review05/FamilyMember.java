package com.neotech.review05;

public class FamilyMember {

	//creating a class
	
	//this is an instance variable, belongs to the instance/object
	String firstName;
	static String lastName; //static/class variable, belongs to the class. the static means it will not change
	int age; //instance variable, belongs to the instance/object
	
	//when it's instance method you can print anything 
	//this one belongs to the object
	void printFullName() {
		System.out.println("full name is " + firstName + " " + lastName);
	}
	
	//in a static method you can only print static
	//does not need an object 
	//with static methods you can access ONLY static variables 
	static void printFamilyName() 
	{
		//System.out.println("full name is " + firstName + " " + lastName);
		System.out.println("Family name is " + lastName);
	}
	

}
