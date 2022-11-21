package com.neotech.review07_Polymorphism;

public class MethodOverloading {

	//Method signature = method name + parameters
	//access modifier is NOT part of Method signature. public, private, default
	//return type is NOT part of Method signature. 
	//data type must be different. Int, String .... the name of the data type doesn't matter 
	
	
	public static void main(String[] args) {
		//must create this object to call the methods when they are not static 
		MethodOverloading mo = new MethodOverloading();
		mo.methodOne("Dardan");
		
		//Polymorphism
		//Method overloading
		//Compile time polymorphism/early binding. static binding 
	
	}
	
	//These are examples of method overloading
	
	//method with no parameters
	public void methodOne() {
		
	}
	
	public void methodOne(int a) {
		
	}
	
	public void methodOne(String b) {
		
	}
	
	public void methodOne(int a, int b) {
		
	}
	
	public void methodOne(double a, double b) {
		
	}
	public void methodOne(double a, int b) {
		
	}
public void methodOne(int a, double b) {
		
	}
}
