package com.neotech.review06;

public class Student {

	//instance variables.
	//these are the variables that every student will have a name and age
	//non static variables
	String name;
	int age;
	
	//static or class variable
	//every student is going to have the same school
	static String school;
	
	//this is a constructor with multiple parameters
	//when we create a student we want to set the name and age
	public Student(String name, int age)
	{
		
		this.name = name;
		this.age = age;
		//use this. when the variable and parameter are named the same so we need to distinguish. The this.name is pulling
		//from the instance variables
		//this. can only be used for instance variables when we are talking about objects 
	}
	
	//method
	//this will be used to print the information
	//non static method
	public void displayStudentInfo()
	{
		System.out.println("My name is " + this.name + " my age is " + this.age + " I study at " + Student.school);
	}
	
	
	
	public static void main(String[] args) {
		
		Student.school = "NeoTech"; //this prints like this because it's in the same class
		//this school gets assigned to every student we create. 
		
		//We don't have a default constructor to run this 
		//Student s1 = new Student(); //default constructor
		
		//this is creating an object 
		Student s2 = new Student("Catherine", 15);
		s2.displayStudentInfo(); 
		
		Student s3 = new Student("Allee", 15);
		s3.displayStudentInfo();
		
	}
	
}
