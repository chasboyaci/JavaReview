package com.neotech.review07_Abstraction2;

public class Apple extends Fruit implements Peelable, Washable {

	
	//you can only extend one class
	//You can implement multiple interfaces 
	
	public Apple(String color) {
		super(color);
		
		
	}

	@Override
	public void peel() {
		System.out.println("Peeling the apple.");
		
	}

	@Override
	public void wash() {
		System.out.println("Washing the apple.");
		
	}

}
