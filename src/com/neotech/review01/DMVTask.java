package com.neotech.review01;

import java.util.Scanner;

public class DMVTask {

	public static void main(String[] args) {
/*
* You are DMV representative and you need to ask customer their age. If they
* are 18 and older you will issue a driver licence to them, otherwise you will
 * offer them to get a learners permit.
 */

	Scanner input = new Scanner(System.in);
	
	System.out.println("How old are you?");
	int age = input.nextInt();
	
	if (age >= 18)
	{
		System.out.println("I can issue you a driver license");
	}
	else if (age < 18 )
	{
		System.out.println("I can only issue you a learners permit");
	}
	else 
	{
		System.out.println("Invalid input");
	}
		

	}

}
