package com.neotech.review01;

import java.util.Scanner;

public class GenerateRandom {

	public static void main(String[] args) {
	
		int min = 1;
		int max = 9;
		
		System.out.println("Random value in int from "+min+ " to " +max+ ":");
		int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
		//System.out.println(random_int);

		Scanner input = new Scanner(System.in);
		
		
		
		boolean x;
		
		
		while (x=true)
		{
			
			System.out.println("Please guess a number!");
			int guess = input.nextInt();
		
		if (random_int == guess)
		{
			System.out.println("Yayy!! You are correct");
			x=true;
		}
		else
		{
			System.out.println("Try again...loser");
			x=false;
			
			
		}
		
		
		}
		
	}

}
