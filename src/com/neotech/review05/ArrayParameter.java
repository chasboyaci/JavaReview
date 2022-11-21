package com.neotech.review05;

import java.util.Arrays;

public class ArrayParameter {

	public static void main(String[] args) {
	//MAIN METHOD STARTS AT LINE 7 AND ENDS AT LINE 29 
		
		
		int[] array = {7,3,5,9,8};
		//System.out.println(array[2]); 
		
		//how to print the whole array
		//print the array using Arrays.toString(array) method
		String str = Arrays.toString(array);
		
		System.out.println(str); //[7, 3, 5, 4, 8]
		
		ArrayParameter ap = new ArrayParameter();
		
		int result = ap.largestNumber(array);
		
		System.out.println("The largest num in the array is: " + result);
		
		result = ap.arraySum(array);
		System.out.println("The sum of the array is " + result);
		
		double d = ap.arrayAvg(array);
		System.out.println("The average of the array is " + d);
	}
	
	//8 is the largest in the array
		
		//System.out.println(array[4]); //prints 8 
		
		
		//find method to find the largest in the array
		//this is a method:
		public int largestNumber(int[] arr) {
			int largest = arr[0];
			
			for (int el : arr){
				if (el > largest){
					largest = el;
				}
			}
				
			return largest;
		}
		
		
		// Task2
		// Create a method that will get an array of integers,
		// and return the sum
		// Make the method protected

		// Task3
		// Create method that will get an array of integers,
		// and return the average as a double
		// Make the method private
//this is a method 
		//task 2 results
		protected int arraySum(int[]arr)
		{
	int sum = 0;
	
	for(int el : arr)
	{
		sum += el;
	}
	return sum;
}
//task 3 results: 
		//another method
	private double arrayAvg(int[] arr) {
	
	{
		
		int sum = 0;
		
		for(int el : arr) 
		{
			sum += el;
		}
		
		int average = sum /arr.length;
		
		return average; //this is casting because int average is an int for the return and it's going to the d in 
		//in the main method which is a double.
		//that's called casting
		
		//dividing a double by int the result is a double
		//diving an int by an int the result is an int
	}
		
	}
}
		
		
		
		
		

