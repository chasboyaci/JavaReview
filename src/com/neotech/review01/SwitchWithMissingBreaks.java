package com.neotech.review01;

public class SwitchWithMissingBreaks {

	public static void main(String[] args) {
		
		int number = 4;
		
		switch (number) 
		{
		case 2:
			System.out.println("2");
		case 3:
			System.out.println("3");
		case 4:
			System.out.println("4");
		case 5:
			System.out.println("5");
		case 6:
			System.out.println("6");
		
		}

	}

}
//limitations of switch
//1. you can't have duplicates
//2. You should be careful with breaks
//3. You can't use logical operators like in if-else
// if (number == 3 || number == 4)
//4. you cannot use double