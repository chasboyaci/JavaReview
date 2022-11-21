package com.neotech.review06;

public class World {

	public static void main(String[] args) {
		
		//1st way, using constructor with no parameters 
		//java will create a default parameters in the Person class
		Person p1 = new Person();
		
		p1.displayInfo(); //this one is null because we didn't set the options like below
		
		//these are objects
		p1.name = "Catherine";
		p1.age = 35;
		p1.weight = 110;
		
		p1.displayInfo();
		
		
		//2nd way, using the constructor with TWO parameters
		//the constructor is a special method 
		//this is pulling from Person class second constructor
		
		//this is an object
		Person p2 = new Person("Allee", 10);
		
		p2.displayInfo(); // Name: Allee age: 10 weight: 0
		
		p2.weight = 150;
		p2.displayInfo(); //Name: Allee age: 10 weight: 150
		
		
		
		System.out.println("___________________________");
		//3rd way, using the constructor with THREE parameters
	
		Person p3 = new Person("Catherine", 35, 110);
		p3.displayInfo();
		
	}
	
	
	
}
