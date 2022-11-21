package com.neotech.review04;

public class Baby {
	
	//every class has a structure. The variables and methods must be inside of the class {}
	//usually variables are before the methods but it's not required 
	
	//variable/attributes/properties of the baby:
	
	String name;
	
	char gender;
	
	int weight;
	
	String hairColor; 
	
	//methods/behaviors/actions:
	
	//void will not return anything 
	void talk()
	
	{
		System.out.println(name + " Baby is talking");
		
	}
	

	void eat()
	{
		System.out.println("Baby is eating");
	}
	
	
	void cry()
	{
		System.out.println("Baby is crying");
	}
	
	void displayInformation()
	{
		System.out.println(name + ", gender is " + gender + ", weight is " + weight);
	}
	
	
	
	
}
