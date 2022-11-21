package com.neotech.review03;

import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {
		
		// Ask the user: How many numbers do you want to store in the array?
		// Ask him to enter the numbers: Read numbers and enter them into the array
		// Print the numbers from the array
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many numbers do you want to store in the array?");
		int size = input.nextInt();
		
		//Declaring the array/ step#1
		int[] array = new int[size];
		
		//Read numbers and enter them into the array
		for(int i =0; i < size; i++)
		{
			System.out.println("Enter a number:");
			array[i] = input.nextInt();
		}
		
		//Print the numbers from the array
		
		System.out.println("Let's print the numbers from the array");
		
		for(int i = 0; i < array.length; i++) //  array.length or we can use size
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		System.out.println("_________________________________________________");
		
		
		System.out.println("Let's print the numbers using enhances for loop");
		for(int element : array) //for every element in the array
		{
			System.out.print(element + " ");
		}
		
		System.out.println();
		
//Homework
//Print the sum of the numbers of the array
		System.out.println("_________________________________________________");
		
		
		int sum = 0; 
		
		for(int element : array)
		{
			sum = sum += element;
		}
		System.out.println("The total is " + sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
