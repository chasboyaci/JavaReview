package com.neotech.review03;

public class MaxIn2DArray {

	public static void main(String[] args) {
		
	//Find the biggest number in a 2D Array	
	int[][] b = {	
		{6, 3, 7},
		{2, 4, 9},
		{1, 5, -4},
		{8, 6, 0}	
	};
		
		
		int biggest = b[0][0];  // we don't start with zero, numbers might be negative
		
		
		//for loop 
		
		for(int row = 0; row < b.length; row++)
		{
			for(int col = 0; col < b[row].length; col++)
			{
				int element = b[row][col];
				
				if(element > biggest) //I found a bigger element
				{
					biggest = element;
				}
			}
		} System.out.println("The biggest element/number in the array is: " + biggest);
		
		
		//Enhanced for loop
		
		int max = b[0][0];
		
		for(int[] row : b)
		{
			for(int element : row)
			{
				if(element > max)
				{
					max = element;
				}
			}
		}
		System.out.println("The max number is: " + max);
		
		
		

	}

}
