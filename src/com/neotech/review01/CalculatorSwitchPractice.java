package com.neotech.review01;

import java.util.Scanner;

public class CalculatorSwitchPractice {

	public static void main(String[] args) {
		
// Using scanner class to create a calculator. Allow user to enter 2
// numbers and operator(+,-,*,/). Based on operator provide the result to user.	
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your first number:");
		double firstNumber = input.nextDouble();
		
		System.out.println("Please enter your second number:");
		double secondNumber = input.nextInt();
		
		System.out.println("Please enter an operator (+,-,*,/):");
		String operator = input.next();
		
		double results = 0;
		
		switch (operator)
		{
		
		case "+":
			results = firstNumber + secondNumber;
			break;
			
		case "-":
			results = firstNumber - secondNumber;
			break;
			
		case "*":
			results = firstNumber * secondNumber;
			break;
			
		case "/":
			results = firstNumber / secondNumber;
			break;
			default:
				
				System.out.println("Invalid operator");	
			break;	
		}
		
		if (operator.equals("+")|| operator.equals("-") || operator.equals("*")
				|| operator.equals("/"));
		
		{
			System.out.println("The results equals to: " + results);
		}
		

	}

		
	}


