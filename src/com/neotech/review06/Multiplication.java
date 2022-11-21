package com.neotech.review06;

public class Multiplication {
	
	//Method overloading: The name of the method should be the same
	//Method signature = method name + parameters(should be unique)
	
	//Access modifiers is Not part of Method SIGNATURE
	//Return type is Not part of the Method signature
	
	//this has two parameters 
	public static void multiply(int num1, int num2)
	{
		int result = num1 * num2;
		System.out.println(result);
	}
	
	//Is it method overloading if the method is not static? YES
	//Is it method overloading if the method is not private? YES

	//this has three parameters
	//"multiply is called the method name and what is inside it's () are called the parameters 
	public static void multiply(int num1, int num2, int num3)
	{
		System.out.println(num1*num2*num3);
	}
	
	
	public static void multiply(double d1, double d2)
	{
		double result = d1* d2;
		System.out.println(result);
	}
	
	
	//Task
	public static void multiply(int[] numbers)
	{
		int result = 1;
		
		for(int num :numbers)
		{
			result *= num;
		}
		System.out.println(result);
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Multiplication.multiply(5,2); //We don't need to specify the class name because it's in the same class.
		
		multiply(4,5,2);
		
		//Task
		int[] array = {5,2,3,4};
		multiply(array);
		
	}
	
	
	
}
