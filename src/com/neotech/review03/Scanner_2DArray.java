package com.neotech.review03;

import java.util.Scanner;

public class Scanner_2DArray {

	public static void main(String[] args) {
		
//Create the array (String[][] names)
//Fill the array
//Print the array
		
		Scanner input = new Scanner(System.in);
		
		String [][] names = new String[2][2];
		
		for(int row = 0; row < names.length; row++)
		{
			
			for(int col = 0; col < names.length; col++)
			{
			
				System.out.println("Please enter a name:");
			 names[row][col] = input.next();
				
			} 
			
		} 
		
		for(int row = 0; row < names.length; row++)
		{
			
			for(int col = 0; col < names.length; col++)
			{
				
				System.out.print(names[row][col] + " ");
				
			}
		System.out.println();
				
				
		}
		
		
		
		
		
		
		
	
		
		
		

	}

}
