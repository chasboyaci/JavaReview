package com.neotech.review05;

public class FamilyDemo {

	public static void main(String[] args) {
		//I CAN access static or class variables before I create an object
		
		FamilyMember.lastName = "James";
		
		
		//I CANNOT access instance or non static variables before I create an object
		//FamilyMembers.firstName = "Lebron";
		
		//I CAN access static/class methods before I create an object
		FamilyMember.printFamilyName();
		
		
		//I CANNOT access non-static methods before I create an object
		//FamilyMembers.printFullName();
		
		System.out.println("____________________________________________");
		
		//creating an object
		FamilyMember member1 = new FamilyMember();
		member1.firstName = "Lebron";
		member1.age = 37;
		
		//creating an object
		FamilyMember member2 = new FamilyMember();
		member2.firstName = "Savannah";
		member2.age = 23;
		
		member1.printFullName();
		member2.printFullName();
		
		System.out.println("____________________________________________");
		System.out.println("They went to the court and changed their lastname");
		
		
		//static variables CAN change 
		//better to use the class name instead of using member2.lastName = "Brown";
		//because it's static and it changes for all
		FamilyMember.lastName = "Brown";

		member1.firstName = "King Lebron"; //full name is King Lebron Brown
		
		member2.printFullName(); //full name is Savannah Brown
		member1.printFullName(); //full name is Lebron Brown
		
		
		//They had a baby
		FamilyMember baby = new FamilyMember();
		
		//does this baby have a first name:
		System.out.println("firstName " + baby.firstName); //null because we didn't 
		//this better to use 
		
		//Does this baby have a last name
		System.out.println("lastName --> " + baby.lastName); //Brown
		
		
		
	}

}
