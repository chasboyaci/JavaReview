package com.neotech.review02;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		//Ask the user to enter positive numbers and add it to the total
		//He should enter -1 to STOP. -1 will not be added to the total
		
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int total = 0; 
		
	//USING WHILE
//		System.out.println("Please enter a positive number! to Stop enter -1");
//		num = scan.nextInt();
//		
//		while(num != -1)
//		{
//			total += num;
//			System.out.println("Please enter a positive number! to Stop enter -1");
//			num = scan.nextInt();
//		}
//		
//		System.out.println("Total = " + total);
		System.out.println("+++++++++++++++++++++++++++++++=======================");
		
		//DO WHILE in this task this one is the best 
//		do{
//		System.out.println("Please enter a positive number! to Stop enter -1");
//		num = scan.nextInt();
//		
//			if (num != -1 ) {
//				total += num;
//			}
//		}while (num != -1);
//		{
//			System.out.println("Total = " + total);
//		}
		
		//FOR LOOP
		
		//1st iteration -> 1. initialization 2. check condition
		//Next iteration -> 1. increment; 2. check condition
		//for (int i = 1; i <= 3; i++) {
		//System.out.println(i);
		
		
		System.out.println("Please enter a positive number! to Stop enter -1");
		num = scan.nextInt();
		
		for(; num != -1; ) {
			total += num;
			System.out.println("Please enter a positive number! to Stop enter -1");
			num = scan.nextInt();
		}
		System.out.println("Total = " + total);
	}

}
