package com.neotech.review03;

public class TwoD_ArrayIntro3 {

	public static void main(String[] args) {
	
		int[][] nums = {
				{3, 6},
				{5, 2, 9, 7},
				{8}
		};
	
		System.out.println("The number of rows: " + nums.length); //number of rows
		System.out.println("The length of the row with index 1: " + nums[1].length); //number of columns in the 2nd row
	System.out.println("__________________________________________________-");	
		
	for(int row = 0; row < nums.length; row++)	
	{
		//nums[row].length will give me the length of that specific row
		for(int col = 0; col < nums[row].length; col++)
		{
			System.out.print(nums[row][col] + " ");
		}System.out.println();
	}
		
System.out.println("_______________________________________________________");
//Nested Enhanced/Advanced for loop

	for (int[] row : nums)
	{   // I WILL iterate the row (1D-Array) with an enhanced for loop
		for(int element : row)
		{
			System.out.print(element + " ");
		}System.out.println();
	}
		
		
		
		
		
		
		
		

	}

}
