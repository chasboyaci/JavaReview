package com.neotech.review05;

public class SplitDemo {

	public static void main(String[] args) {
		
String longStr = "I am very happy today, because today is not Monday.";
		
		String[] strArray = longStr.split("today");
		
		System.out.println(strArray.length); //3
		
		
		System.out.println("____________________________");
		//arrays are married to for loops and enhanced for loops
		//if you have any array of Strings than you have String elements. Array of char than element of chars
		//etc.....for every variable type
		for(String element : strArray)
		{
			System.out.println(element);
		}
		
		
		System.out.println("____________________________");
		for(int i = 0; i < strArray.length; i++)
		{
			System.out.println(strArray[i]);
		}
		
		
		System.out.println("____________________________");
		
		
		longStr = "I like number 5 and 6 because 7 at 9.";
		
		String[] stringArray = longStr.split("[0-9]"); //split from numbers 0 to 9 
		System.out.println(stringArray.length); //5

		
		String[] stringArray1 = longStr.split("[09]"); //means to split at 0 or at number 9 
		System.out.println(stringArray1.length); //2
		
		
		String[] stringArray2 = longStr.split("[57]"); //means to split at 5 or at number 7 
		System.out.println(stringArray2.length); //3
		
		for(String str : stringArray2)
		{
			System.out.println(str);
		}
		
		String[] stringArray3 = longStr.split("57"); //means to split at number 57
		System.out.println(stringArray3.length); //there's no 57 in the sentence
		
		
	}

}
