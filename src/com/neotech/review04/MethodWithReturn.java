package com.neotech.review04;

public class MethodWithReturn {

	public static void main(String[] args) {
		
		//String is a class
		//boolean, int, char, float, long, byte are primetives
		
		String name = "Dardan";
		int numberofChars = name.length(); //this is a method of String
		
		System.out.println("The length of " + name + " is " + numberofChars);
		
		MethodWithReturn m = new MethodWithReturn();
		
		boolean res = m.isOdd(57);
		System.out.println("The number 57 is odd? " + res);

		System.out.println(m.isOddEnhanced(90)); //prints false
		
		
	}
	//longer way
	//give me a number (int num) and the compiller will give me a result 
	boolean isOdd(int num)
	{
		boolean result;
		if(num%2 ==1)
		{
			result = true;

		}else
		{
			result = false;
		}
			
		return result;
	}
	

	//shorter way
	
	boolean isOddEnhanced(int num)
	{
		return num % 2 ==1;
	}
	
	
	
	
	
}
