package com.neotech.review05;

public class Canada {

	public static void main(String[] args) {
		
		USA us = new USA();
		
		System.out.println("Accessing the variables from inside Canada");
		System.out.println("public-> " + us.bestSchool); //yes can access from Canada
		System.out.println("default->  " + us.normalState); //yes can access from Canada
		System.out.println("protected->  " + us.mainState); //yes can access from Canada
		//capitalCity is private
		//System.out.println("private->  " + us.capitalCity); //no cannot access from Canada because it's private. only accessible only inside the USA class
		
		
		
		System.out.println("Accessing the variables from inside Canada");
		
		us.speakEnglish(); //yes it's public
		us.playNBA(); //yes it's protected because it's in the same package
		//us.selectPresident(); // no, it's private. must be in the same class of USA
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
