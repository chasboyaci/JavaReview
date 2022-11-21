package com.neotech.review07_Polymorphism;

//EVERY CLASS BY DEFAULT EXTENDS THE OBJECT CLASS
public class Human {

	//fields/variables
	
	String name; //instance variable
	static String planet; //class variable because it's static 
	
	//default constructor. Even if we don't add this Java creates on by default
	public Human() {
		//super(); is being called everytime even if we don't add it
		
		System.out.println("A human is being created");
	}
	
	public Human(String name) {
		this.name = name;
	}
	
	//behavior/method
	
	public void talk() {
		
		System.out.println("bla bla bla");
	}
	
	
	
	
}
