package com.neotech.review08;

import java.util.ArrayList;
import java.util.Iterator;

class Student{

	String name;
	
	//create a constructor
	
	public Student (String name) {
		this.name = name;
		
	}
	
	//getter
	public String getName()
	{
		return name;
	}
	
	//method
	public void studentInfo()
	{
		System.out.println("The name is -> " + name);
	}
	
	
	
}


public class StudentList {

	public static void main(String[] args) {
	
	ArrayList<Student> studentList = new ArrayList<>();
	
	Student s1 = new Student("Catherine"); //s1 is an object of the student 
	//studentList.add("Catherine"); can't do this 
	
		studentList.add(s1);
		studentList.add(new Student("Allee"));
		studentList.add(0, new Student("Sophie"));
		
		System.out.println("Size -> " + studentList.size());
		
		for(Student element: studentList)
		{
			element.studentInfo();
		}
		
		System.out.println("_____Iterator____");
		Iterator<Student> it = studentList.iterator();
		
		
		while(it.hasNext())
		{
			Student s = it.next();
			s.studentInfo();
		}
		
		
	}
	
}


