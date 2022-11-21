package com.neotech.review01;

public class TypeCasting {

	public static void main(String[] args) {
		
//byte < short < int < long < float < double < 
//byte < short < int < long = whole numbers
//float < double = decimal
		
		int intNumber = 50;
		
		//WIDENING/implicit casting/automatically
		double doubleNumber = intNumber;
			// take the value stored into the int and store into a double
		System.out.println("InNumber -->" + intNumber);
		//InNumber -->50
		System.out.println("DoubleNumber -->" + doubleNumber);
		//DoubleNumber -->50.0

		
		//This is how you NARROW. Putting an int into the byte. You may lose data
		//Explicit casting/manually. That is why we need to add (byte) 
		byte byteNumber = (byte) intNumber;
		
		System.out.println("byteNumber -->" + byteNumber);
		//byteNumber -->50
		
		//reassigning
		intNumber = 670;
		
		byte byteNumber2 = (byte) intNumber;
		System.out.println("byteNumber -->" + byteNumber2); //byteNumber2
		//In this case I am losing data because the int (670) is larger than 
		//a byte 
		
		
		//widening 
		byte byteNumber3 = 90;
		int intNumber3 = byteNumber3;
		System.out.println("byteNumber3 -->" + byteNumber3); //byteNumber3 -->90
		
		//---------------------------------------------------------------------
		
		
		
		
		
		
		
		
		
	}

}
