package com.neotech.review04;

public class SubStringDemo {

	public static void main(String[] args) {
		
		String longStr = "I am very happy today because today is not Monday";
		
		String anotherStr = longStr.substring(5,7);
		System.out.println(anotherStr); //prints only characters ve. character 5 and 6. 7 is not included
		
		String anotherStr2 = longStr.substring(5);
		System.out.println(anotherStr2); //prints very happy today because today is not Monday. Starts printing at printing at character 5
		
		System.out.println(longStr); //prints: I am very happy today because today is not Monday
		
		longStr = longStr.substring(10);
		System.out.println(longStr);//prints happy today because today is not Monday
		
		//Run-time error
		//longStr.substring(8,5);
		//System.out.println(longStr); //run time error 
		
		//longStr.substring(5,100); //another run time error because we don't have 100 characters 
		//System.out.println(longStr);
		
		//longStr.substring(-5, 10); //error, we can start at a minus 
		//System.out.println(longStr);
	}

}
