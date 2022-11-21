package com.neotech.review01;

import java.io.InputStream;
import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your grade:");
		int grade = input.nextInt();
		
		if (grade > 89)
		{
			System.out.println("A-Excellent");
		}
		else if (grade > 79)
		{
			System.out.println("B-Good");
		}
		else if (grade > 69)
		{
			System.out.println("C-Average");
		}
		else if (grade > 59)
		{
			System.out.println("D-Bad");
		}
		
		else
		{
		System.out.println("Not Acceptable");
		}
		
	}

}
