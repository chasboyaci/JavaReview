package com.neotech.review01;

import java.util.Scanner;

public class ScannerTask {

	public static void main(String[] args) {
		//If you are a boy
		//If you are rich -- Buy a Ferrari
		//otherwise -- Play soccer

		//If you are a girl
		//If you are rich -- Buy a LV bag
		//otherwise -- Read a book
		
		//if you are none
		//invalid gender
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Please enter your gender:");
		char gender = scan.next().charAt(0);

		System.out.println("Are you rich? (true/false)");
		boolean rich = scan.nextBoolean();

		if (gender == 'M')
		{
			System.out.println("Yayy, it's a boy"); //NestedIf 
			if (rich)
			{
				System.out.println("By a Ferrari");
			}
			else
			{
				System.out.println("Play soccer");
			}
		}
		
		else if (gender == 'F')
		{
			System.out.println("Oh noo, it's a girl");
			if (rich)
			{
				System.out.println("By a LV bag");
			}
			
			else
			{
				System.out.println("Read a book");
			}
		}
		
		else
		{
		System.out.println("Invalid gender");
		}
		
	}

}
