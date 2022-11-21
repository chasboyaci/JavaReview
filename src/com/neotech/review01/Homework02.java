package com.neotech.review01;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		
		
/*Using scanner class to create a calculator. Allow user to enter 2 
// and operator(+,-,*,/). Based on operator provide the result to user*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter first number:");
		double number = input.nextDouble();
		
		System.out.println("Please enter second number");
		double number2 = input.nextDouble();
		
	System.out.println("Please enter operator (+,-,*,/)");
		String operator = input.next();
		
		if (operator.equals("+"))
		{
			System.out.println("The result is: " + (number + number2));
		}
				
		else if (operator.equals("-"))
		{
			System.out.println("The result is: " + (number + number2));
		}
		else if (operator.equals("*"))
		{
			System.out.println("The result is: " + (number + number2));
		}
		
		else if (operator.equals("/"))
		{
			System.out.println("The result is: " + number + number2);
		}
		
		else
		{
			System.out.println("Invalid");
		}
		
		
		
		
	}

}
