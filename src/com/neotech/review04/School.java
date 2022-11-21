package com.neotech.review04;

public class School {

	
	public static void main(String[] args) {
		
		
		Student student1 = new Student();
		
		student1.name = "Kenan";
		student1.studentNr = 358;
		student1.gradeLevel = 10;
		
		
		Student student2 = new Student();
		
		student2.name = "Catherine";
		student2.studentNr = 458;
		student2.gradeLevel = 12;
		
		Teacher teacher = new Teacher();
		
		teacher.name = "Sabah";
		teacher.salary = 150000;
		teacher.subject = "Java";
		
		System.out.println("Let's call the method ");
		
		student1.study();
		student2.sleep();
		
		//prints:
		//Let's call the method 
		//Kenan is studying
		//Catherine is sleeping
		
		student2.study();
		//Prints: Catherine is studying
		
		teacher.teach();
		//Sabah is teaching Java
		
		teacher.yellAtStudent(student1.name);
		//Sabah is yelling at the students Kenan

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
