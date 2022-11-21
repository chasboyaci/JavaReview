package com.neotech.review01;

import java.util.Scanner;

public class TaskLoan {

	public static void main(String[] args) {
/*
 *  * You are a loan specialist and you need to ask the user what is the amount of
 * loan that is needed. If loan is less or equal to 200,000 then you would lend
 * the money otherwise you would reject the client.
 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How much do you want to borrow?");
		double amount = input.nextDouble();
		
	if (amount <= 2000000)
	{
		System.out.println("Your are approved");
	}
	else if (amount > 200000)
	{
		System.out.println("You are denied");
	}
	else 
		System.out.println("Invalid amount");
	}

}
