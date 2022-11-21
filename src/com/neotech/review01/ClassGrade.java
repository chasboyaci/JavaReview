package com.neotech.review01;

import java.io.InputStream;
import java.util.Scanner;

public class ClassGrade {

	public static void main(String[] args) {
/*
* Allow user to enter grade and then provide explanation:A-Excellent, B-Good,
* C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program
* should print which grade was entered by a user with explanation.
*/
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your grade: ");
		int grade = input.nextInt();
		
		if (grade >= 90)
		{
			System.out.println("Your grade is A-Excellent");
		}
				
		else if (grade >= 80)	
		{
			System.out.println("Your grade is B-Good");
		}
		else if (grade >= 70)
		{
			System.out.println("Your grade is C-Average");
		}
		else if (grade >= 60)
			System.out.println("Your grade is D-Bad");

		else 
		{
			System.out.println("Not Acceptable");
		}
	}

}
