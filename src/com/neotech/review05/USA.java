package com.neotech.review05;

public class USA {
	
	
	//ACC MODIFIER, we define where the variables or methods  can be accessed from 
	private String capitalCity = "Washington DC"; //access from this class
	protected String mainState = "NewYork"; //access from this package
	String normalState = "Texas"; //access from this package //when its nothing before String it's considered default
	public String bestSchool = "NeoTech"; //access from anywhere in the project
	
	
	//METHODS
	//you can selected the president only within the USA class
	private void selectPresident()
	{
		System.out.println("Selecting the president only within USA");
	}
	
	//YOU CAN ACCESS FROM THE USA AND CANADA. Protected works within the same pacakage 
	protected void playNBA() 
	{
		System.out.println("There are US and Canada teams in the NBA");
	}
	
	//YOU CAN ACCESS IT FROM ANY PACKAGE
	public void speakEnglish() 
	{
		System.out.println("English is spoken everywhere");
	}
	

	
	public static void main(String[] args) 
	{
		USA us = new USA();
		System.out.println("Accessing the variables from inside USA");
		System.out.println("public-> " + us.bestSchool);
		System.out.println("default->  " + us.normalState);
		System.out.println("protected->  " + us.mainState);
		System.out.println("private->  " + us.capitalCity);
		
		
		System.out.println();
		
		
		
		System.out.println("Accessing the variables from inside USA");
		
		us.speakEnglish();
		us.playNBA();
		us.selectPresident();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
