package com.neotech.review06;

public class Person {

	
	
	//instance variable
	//every people we create will have these 
	String name;
	int age;
	int weight;
	
	//these are constructors
	//when you are creating a person you can set the name and age if you like 
	
	//the name of the method is the same name of the class
	//you can have multiple constructors in the same class
	
	//these are constructors
	public Person()
	{
		
	}
	
	public Person(String pName, int pAge)
	{
		name = pName;
		age = pAge;
	}
	
	public Person(String pName, int pAge, int pWeight)
	{
		this(pName,pAge); //this () this using the name and age from 
		//the first constructor
		//if you want to call the constructor it must be first. Can't
		//put it after the weight = pWeight;
		weight = pWeight;
	}
	
	
	//this is not a constructor it's a method 
	public void displayInfo()
	{
		System.out.println("Name: " + name + " age: " +  age + " weight: " + weight);
	}
	
	
	
	
}
