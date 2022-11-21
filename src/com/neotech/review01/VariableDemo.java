package com.neotech.review01;

public class VariableDemo {

	public static void main(String[] args) {
		
		//Declare a variable
		//CamelCasing: capitalizing the second word
		String firstName;

//Step 1 is to assign a value or (initialize)for the String to print
		firstName = "Catherine";
		
		System.out.println("My first name is " + firstName);
				
		//Declare a variable and assign a value example
		//using String because it's characters
		String lastName = "Hasboyaci";
		
		//using int because it's numbers 
		int age = 35;
		
		//concatenation is when you add multiple variables 
		System.out.println(firstName + " " + lastName + " " + age +1 );
		//Catherine Hasboyaci 351
		System.out.println(firstName + " " + lastName + " " + (age +1));
		//Catherine Hasboyaci 36

		System.out.println(age);
		//35
		
		//-----------------------------------------------------------------------
		//re-assign a new value to the container
		age +=5;
		lastName = "Rivas";
		
		System.out.println("After getting Married");
		//After getting Married
		System.out.println(firstName + " " + lastName + " " + age);
		//Catherine Rivas 40
		
		//----------------------------------------------------------------------
		
		
		
		
		
	}

}
