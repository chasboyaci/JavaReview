package com.neotech.review05;

public class ToCharArray {

	public static void main(String[] args) {
		
		String longStr = "I am very happy today, because today is not Monday";
		
		System.out.println("String length: " + longStr.length()); //String length: 50
		
		//length is a method on the String class
		
		char[] charArray = longStr.toCharArray(); //from this String get all the characters and group in an array and return it
		
		System.out.println("char[] length: " +charArray.length); //char[] length: 50
		
		//length() is a method
		//length is a property
		//Arrays uses length that are properties
		
		for(char element : charArray) //if i have an element of chars the elements must be the same char
			//enhanced for loop is good only for when you want to print from the beginning.
		{
			System.out.println(element);
		}
		
		System.out.println();
		
		for(int i =0; i < charArray.length; i++) //this is best when needing to start at the middle or at the end
		{
			System.out.print(charArray[i]);
			
		}
		

		/// Task: Print the whole array, but replace 'a' with 'e'
				// Don't use replace/replaceAll method

				System.out.println("\nPrint the whole array, but replace \"a\" with 'e'");
				
				// must use this to print " "  \"a\"
				
				//\n will give a space when printing
				
				for(char el : charArray)
				{
					if (el =='a')
					{
						System.out.print('e');
					}
					else
					{
						System.out.print(el);
					}
				}
		
		
		
		
		
		
		
		
		
	}

}
