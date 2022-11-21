package com.neotech.review01;

import java.util.Scanner;

public class HeightTask {

	public static void main(String[] args) {

/*
 * 1. Ask the user to enter the height in inches. Person should be classified as
 * one of the following: • short (under 60 inch) • medium (between 60 -72 inch)
 * • tall (over 72 inch)
*/
		
	Scanner input = new Scanner(System.in);
	
		System.out.println("Please enter your height in inches");
		double height = input.nextDouble();//user enters their height in console
		
	if (height < 60)
	{
		System.out.println("Your height is considered short");
	}
	
	else if (height >= 60 && height <= 72)
	{
		System.out.println("Your height is considered medium");
	}
		
	else if (height > 72)
	{
		System.out.println("Your height is considered tall");
	}
		
	else 
	{
		System.out.println("Invalid number");
	}
		
		
		
	}

}
