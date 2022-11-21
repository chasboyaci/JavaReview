package com.neotech.review06;

class Vowels{
	
	
	
	public static void main(String[] args) {
		
		
		
		
		String myString = "Java is magical";

		
		String[] words = myString.split(" ");

		
		
		int maxVowelCount = 0;
		String wordWithMostVowels = "";

		
		for (String word : words) {
		   
		    int currentVowelCount = word.split("[aeiou]", -1).length;

		    
		    if (currentVowelCount > maxVowelCount) {

		        
		        wordWithMostVowels = word;
		        maxVowelCount = currentVowelCount;
		    }
		}

		
		System.out.println(wordWithMostVowels);
		
		
		
		
	}
	
	
	
}