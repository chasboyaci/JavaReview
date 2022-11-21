package com.neotech.review01;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		// Using scanner class to create a calculator. Allow user to enter 2
		// numbers and operator(+,-,*,/). Based on operator provide the result to user.

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the first number:");
		double number = input.nextDouble();

		System.out.println("Please enter the second number:");
		double number2 = input.nextDouble();

		System.out.println("Please enter the operator (+,-,*,/)");
		String operator = input.next();

		double result = 0;

		switch (operator)
		{
		case "+":
			
			result = number + number2;
			break;
		case "-":
			
			result = number - number2;
			break;	
		case "*":
			
			result = number * number2;
			break;	
		case "/":
			
			result = number / number2;
			break;	
			
		default:
			
			System.out.println("Invalid Operator");
			break;

		}
		
		if (operator.equals("+") || operator.equals("-") ||operator.equals("*") 
		|| operator.equals("/"));
	{
	System.out.println("The result is: " + result);	
	}

	
	//Char example
	
	//Scanner input = new Scanner(System.in);
	//System.out.println("Please enter a character:");
//char op = input.next().charAt(0);

//System.out.println("char is " + op);
	

	
}
}

