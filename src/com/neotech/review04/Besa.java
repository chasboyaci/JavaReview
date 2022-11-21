package com.neotech.review04;

public class Besa {

	
		//a method with NO parameters and no return type
		void addTwoNumbers()
		{
			System.out.println("I am inside addTwoNumbers");
			int result = 2 + 5;
		}
		
		//it has 2 parameters a and b but no return time because of void
		void addTwoNumbersThatIGive(int a, int b)
		{
			System.out.println("I am inside addTwoNumbersThatIGive");
			int result = a + b;
		}
		//a method with no parameters (no numbers) and yes it will return a result
		int addTwoNumbersAndGiveMeTheResult()
		{
			System.out.println("I am inside addTwoNumbersAndGiveMeTheResult");
			int result = 2 + 5;
			return result;
			
		}
		// it's int so we want a result 
		//a method with two parameters and with return type
		int addTwoNumbersThatIGiveAndGiveMeTheResult(int num1, int num2)
		{
			System.out.println("I am inside addTwoNumbersThatIGiveAndGiveMeTheResult");
			int result = num1 + num2;
			return result;
		}
	

}
