package com.neotech.review02;

public class Pyramid {

	public static void main(String[] args) {
		
	//*
	//**
	//***
	//****

		for(int row = 1; row <= 4; row++)
		{
			for(int col =1; col <= row; col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//****
		//***
		//**
		//*
		
		System.out.println();
		
		for(int row2 = 1; row2 <= 4; row2++)
		{
			for(int col2= 4; col2 >= row2; col2--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		//11111
		//2222
		//333
		//44
		//5
		
		for(int a = 1; a <= 5; a++)
		{
			for(int b = 5; b >= a; b--)
			{
				System.out.print(a);
			}
			System.out.println();
		}

		//12345
		//1234
		//123
		//12
		//1
		
		
		
		for(int r = 1; r <= 5; r++)
		{
			for(int c = 5; c >= r; c--)
			{
				System.out.print(c);
			}
				System.out.println();
		}
		
		
		
		
	}

}
