package com.neotech.review01;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
//Using scanner class to create a calculator. Allow user to enter 2 
//numbers and operator(+,-,*,/). Based on operator provide the result to user.	
		
		//first step enter Scanner Syste
		//ctrl + shift + o to import Scanner class
		Scanner input = new Scanner (System.in);
		
		//step 2 give an instruction/message: 
		System.out.println("Please enter the first number:");
		
		//step 3 declare variable
		double number = input.nextDouble();
						// input is to read from the console
						//nextDouble, nextInt
						//next() is for String
		//step 4 print statement after input
		//System.out.println("number --->" + number); //number --->6.0
		

		System.out.println("Please enter the second number:");
		double number2 = input.nextDouble();
		
		
		//System.out.println(number + " - " + number2); //6.0 - 15.0
		
		System.out.println("Please enter the operator (+,-,*,/)");
		String operator = input.next();
		
		// Now doing the logic
		//add .equal to the variable when comparing a String
		if (operator.equals("+"))
			//concatenation = adding the () to add the numbers first
		{System.out.println("The result is ->" + (number + number2));	
		}
		
		else if (operator.equals("-"))
 
		{
			System.out.println("The result is ->" + (number - number2));
		}
		else if (operator.equals("*"))
		{
			System.out.println("The result is ->" + (number * number2));
		}
		else if (operator.equals("/"))
		{
			System.out.println("The result is ->" + (number / number2));
		}
		else //always add an else to catch any invalid inputs 
		{
			System.out.println("Invalid operator");
		}
	}
}
		//Second Method:
		
		//Scanner input = new Scanner (System.in);
		
		//System.out.println("Please enter the first number:");
		
		//System.out.println("Please enter the second number:");
		//double number2 = input.nextDouble();
		
		
		//System.out.println("Please enter the operator (+,-,*,/)");
		//String operator = input.next();
		
		
		//double result = 0;
		
		//if (operator.equals("+"))
			
		//result = number + number2;
		
		//else if (operator.equals("-"))
		//{
		//	result = number - number2;
		//}
		//else if (operator.equals("*"))
		//{
		//	result = number * number2;
		//}
		//else if (operator.equals("/"))
		//{
		//	result = number / number2;
		//}
		//else 
		//{
		//	System.out.println("Invalid operator");
		//}
		
		//System.out.println("The result is: " + result);
		
		//if (operator.equals("+") || operator.equals("-") ||operator.equals("*") 
			//|| operator.equals("/"));
		//{
		//System.out.println("The result is:" + result);
	//}

//}
