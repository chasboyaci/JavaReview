package com.neotech.review07_Polymorphism;

public class Albanian  extends Human {

	
	//constructors are not enheritend 
	//must create constructors
	
	public Albanian() {
		
		
	}
	
	public Albanian(String name) {
		super(name);
		
	}
	@Override
	public void talk() {
		System.out.println("hello " + name);
	}
	
	public void albanianDance() {
		System.out.println("Dancing Valle Kosovare!");
	}
	
}
