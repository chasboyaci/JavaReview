package com.neotech.review08;

public class WrapperDemo {

	public static void main(String[] args) {
		
	//primative data type
		
	int num1 = 6;	
		
	//this is a class
	//and constructor
	Integer integer1 = new Integer(num1); //boxing/wrapping here we are putting a primitaive data type into an object
	int num2 = integer1.intValue(); //unboxing/unwrapping  here we are getting the value that is in the object 
		
	//easy way
	int num3 = 9;
	Integer integer3 = num3; //auto-boxing/auto-wrapping/auto-converting
	
	int num4 = integer3; //auto-unboxing/auto-unwrapping/auto-unconverting
	
	//double wrapper
	double d1 = 4.8;
	Double d2 = d1; //auto boxing
	Double d3 = 2.2; //auto boxing
	double d4 = d3; //auto unboxing
	
	Boolean b1 = true; //auto boxing
	
	Character c1 = 'G'; //auto boxing
	
	//int -> Integer
	//byte -> Byte
	//short -> Short
	//long -> Long
	//float -> Float
	//double -> Double
	//boolean -> Boolean
	//char -> Character
	
	
	}
}
