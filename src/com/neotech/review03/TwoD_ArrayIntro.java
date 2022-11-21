package com.neotech.review03;

public class TwoD_ArrayIntro {

	public static void main(String[] args) { //args is not a String array
		
int[][] numbers = new int[3][4]; //this means creating a new array
// 2D dimension each row is technically a one dimensional array
// at the start all the [] [] are zeros until you add different
//value elements into the index	

numbers[1][2] = 9;
numbers[0][1] = 5;	
numbers[0][0] = 3;			
numbers[2][2] = 8;	
		
//reassign a value to an element to 6 
numbers[0][0] = 6;	
// or 
numbers[0][0] += 3;

numbers[2][0] = 4;	
numbers[0][3] = 8;			
numbers[1][0] = 1;			
		
//numbers[3][0] = 6;	// run-time error because [3][0] is outside of the array	
		
int rows = numbers.length;
System.out.println("Number of rows: " + rows);

// or 

System.out.println("Number of rows: " + numbers.length);

int cols = numbers[1].length; //getting the length of row 1 
//(second row) which is 4 elements in row 1

System.out.println("The length of row with index 1 is: " + cols);


for(int row = 0; row < numbers.length; row++)
{
	for(int col = 0; col < numbers[row].length; col++)
	{
		System.out.print(numbers[row][col] + " ");
	}
}System.out.println();
		
		
		
		
		
		

	}

}
