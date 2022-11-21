package com.neotech.review04;

import java.security.DomainCombiner;

public class Methods {
	
	public static void main(String[] args) {
		Methods m = new Methods();
		m.sayWelcome();
		m.sayWelcomeWithNumber(3); // here we are giving a value to (int n) that is in the sayWelcomeWithNumber method by putting 3 in this line. 
		//this will make it print  times. 
		m.sayGreeting("Hola"); //we can't put number because we put a String in the "void sayGreeting(String greeting)" .
		//the variable type given in the behavior must match the method 
		
		m.sayGreetingWithNumber("Hola", 2);
	}
	
	void sayWelcome() 
	
	{
		for(int i = 1; i <=5; i++)
		{
			System.out.print("Welcome" + " ");
		}
		
		System.out.println();
	}
	
	void sayWelcomeWithNumber(int n)
	{
		for(int i = 1; i <= n ; i++)
		{
			System.out.print("Welcome ");
		} 
		System.out.println();
	}
	
	void sayGreeting(String greeting) 
	{
		for(int i = 1; i <=5; i++)
		{
			System.out.print(greeting + " ");
		}
		System.out.println();
	
	}
	
	
	
	//Create a method sayGreetingWithNumber that accepts 
			//the greeting and how many times it should be printed
			
	
	
	void sayGreetingWithNumber(String greeting, int n)
	{
		for(int i = 1; i<= n; i++)
		{
			System.out.print(greeting + " ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
