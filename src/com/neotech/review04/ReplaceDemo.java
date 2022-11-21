package com.neotech.review04;

public class ReplaceDemo {

	public static void main(String[] args) {
		
		
		String longStr = "I am very happy today because today is not Monday";
		
		String anotherStr = longStr.replace('a', 'e');
		System.out.println(anotherStr); //prints: I em very heppy todey beceuse todey is not Mondey
		
		anotherStr = longStr.replace("today","tomorrow");
		System.out.println(anotherStr); //prints: I am very happy tomorrow because tomorrow is not Monday
		
		//Regula Expression
		
		anotherStr= longStr.replaceAll("[a-z]", "*");
		System.out.println(anotherStr); // prints: I ** **** ***** ***** ******* ***** ** *** M*****
		
		String ssn = "123-56-6784";
		String newSSN = ssn.replaceAll("[0-9]", "*");
		System.out.println(newSSN); //***-**-****
		
		newSSN = ssn.replaceAll("[3-7]", "*");
		System.out.println(newSSN); //12*-**-**8*
		
		newSSN = ssn.replaceAll("[37]", "*");
		System.out.println(newSSN); //12*-56-6*84 replaces the 3's and 7's with *
		
		
		

	}

}
