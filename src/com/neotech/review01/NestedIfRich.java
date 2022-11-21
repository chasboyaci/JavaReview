package com.neotech.review01;

import java.util.Scanner;

public class NestedIfRich {

	public static void main(String[] args) {
		
			// If you are a boy
			// If you are rich -- Buy a Ferrari
			// otherwise -- Play soccer

			// If you are a girl
			// If you are rich -- Buy a LV bag
			// otherwise -- Read a book

			// If you are none
			// Invalid gender

		Scanner input = new Scanner(System.in);
		
		System.out.println("Are you a boy or girl?");
		char gender = input.next().charAt(0);
		
		System.out.println("Are you rich? true or false");
		boolean rich = input.nextBoolean();
		
		if (gender == 'M' || gender == 'm')
		{
			System.out.println("Yayy it's a boy");
			
			if (rich)
			{
				System.out.println("Buy a Ferrari");
			}
			else
			{
				System.out.println("Play Soccer");
			}
		}
		else if (gender == 'F' || gender == 'f')
		{
			System.out.println("Yayy it's a girl");
			
			if (rich)
			{
				System.out.println("Buy a LV Bag");
			}
			else
			{
				System.out.println("Read books");
			}
				
		}
		
		else
		{
			System.out.println("Invalid gender!");
		}
		
		
	}

}
