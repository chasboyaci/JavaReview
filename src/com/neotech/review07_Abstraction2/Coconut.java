package com.neotech.review07_Abstraction2;

//In Java we don't have multiple inheritance 
//In Java we achieve multiple inheritance through interfaces

public class Coconut extends Fruit implements Crackable  {

	public Coconut(String color) {
		super(color);
		
	}

	@Override
	public void crack() {
		System.out.println("Cracking the coconut.");
		
	}

	
	
}
