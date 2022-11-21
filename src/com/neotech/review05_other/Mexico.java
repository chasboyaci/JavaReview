package com.neotech.review05_other;

import com.neotech.review05.USA; //command shift o will import

public class Mexico {

	//this is in a different package from USA class
	
	public static void main(String[] args) {
		
		USA us = new USA(); //when I added this Eclipse added import com.neotech.review05.USA; under the package name at the top
		
		System.out.println("Accessing the variables from inside Mexico");
		System.out.println("public-> " + us.bestSchool); //yes can access from Mexico
		//System.out.println("default->  " + us.normalState); //cannot access from Mexico, outside of package
		//System.out.println("protected->  " + us.mainState); //cannot access from Mexico, outside of package
		//System.out.println("private->  " + us.capitalCity); //cannot access from Mexico, outside of package
		
		//only public variables can be accessed outside of the package from where the USA class is stored
		
		
		System.out.println("Accessing the variables from inside Mexico");
		
		us.speakEnglish(); //yes it's public
		//us.playNBA(); //no it's protected. Tt's not in the same package
		//us.selectPresident(); // no, it's private. must be in the same class of USA
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
