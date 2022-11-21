package com.neotech.review03;

public class ArrayIntro {

	public static void main(String[] args) {
		
	//1st serious way
	int[] array = new int [4]; //I want to reserve space in the computer for 4 integers
	array[0] = 6; //in the first space of the index we want to put a 6 element
	array[2] = 9; //the default value of arrays are zeros and the default for boolean is false
	array[3] = 2;
	array[1] = 4;	
	
	//to add them up
	int sumArray = 0; //create a sum variable to store the total 
		
	for(int i = 0; i < array.length; i++)	
	{
		sumArray += array[i];
	}
		System.out.println("The sum is: " + sumArray);
		
		System.out.println("__________________________________________");
	//2nd serious way
		//Enhanced/Advanced/Each for loop
		
	int[] array2 = {6,4,9,2};
	
	int sumArray2 = 0;
	
	for(int num : array2) // for every element inside the array/ Every loop is called an iteration 
	{
		sumArray2 += num;
	}
	System.out.println("The sum is: " + sumArray2); //place this outside of the for each loop
		
	System.out.println("__________________________________________");		
		
	String[] animals = {"dog", "cat", "pig"};
	
	for(int i = 0; i < animals.length; i++)
	{
		System.out.print(animals[i] + " ");
	}
		System.out.println();

		System.out.println("__________________________________________");
	
	for(String element : animals)
	{
		System.out.print(element + " ");
	} 
		System.out.println();
	
		System.out.println("__________________________________________");
	
		//putting the length in the first i it means 4 than you add the -1 
		//so in each loop it goes down by one to the next loop
	for(int i = animals.length -1; i >= 0; i--) //to print in the reverse order 
	{
		System.out.print(animals[i] + " ");
	}
	
	
	//for each loop it always starts at 0. It cannot start in the middle or end.
	//you can't print in reverse when using a for each loop 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
