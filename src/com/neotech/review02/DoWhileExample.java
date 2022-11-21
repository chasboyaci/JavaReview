package com.neotech.review02;

public class DoWhileExample {

	public static void main(String[] args) {
		
	//all the loops can do the same thing
		
		System.out.println("Similarities between WHILE & DO-WHILE");
		
	int age = 1;
	
	while (age <= 10)
	{
		System.out.println("Happy Birthday! You are " + age + " years old!");
		age++;
	}
	
System.out.println("=================================================");		
		
	int age2 = 1; 
	
	do
	{
		System.out.println("Happy Birthday! You are " + age2 + " years old!");
		age2++;
	} while (age2 <=10);
		
		
	System.out.println("=================================================");		
	
	System.out.println("Differences between WHILE & DO-WHILE");		
		
		
	boolean hot = true;
	
	while(!hot) //the ! makes it false and in while it will not print
	{
		System.out.println("while -> drink"); 
	}
		
	do //the do while will print because it prints before checking the while is
		//true or false 
	{
		System.out.println("Do--while -> drink");
	} while (!hot);
		
		
	//we can do the same thing with a while and do while but the 
	// do while will print the statement the first time before looking 
	// at the condition. The while always looks at the condition to see if 
	//it should be printed 
		
		
		
		
		
		
		
		

	}

}
