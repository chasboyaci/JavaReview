package com.neotech.review02;

public class MagicDollar2 {

	public static void main(String[] args) {
		
		
		// Task2 (make some changes on Task)
				// $$$$$
				// $   $
				// $   $
				// $$$$$
		
		for(int row = 1; row <= 4; row++)
		{
			for(int col = 1; col <=5; col++)
			{
				if (row == 1 || row == 4 || col == 1 || col == 5)
				{
					System.out.print("$");
				}
				else
				{
					System.out.print(" ");
				}
			}
				System.out.println();		
			
		}
	}

}

