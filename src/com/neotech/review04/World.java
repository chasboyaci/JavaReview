package com.neotech.review04;

public class World {

	public static void main(String[] args) {
	
		//where the software starts executing from the info in the class 
		
		//Declaring and initializing a variable and assigning an object
		//connects to the class/blueprint
		//baby1 is the object
		Baby baby1 = new Baby();
		//baby1 has a structure inside from the class. name, gender, weight and hairColor
		// at the start it's 0 or null
		
		baby1.name = "Pedro";
		baby1.weight = 18;
		
				
		System.out.println("The name of the baby is " + baby1.name);
		//	The name of the baby is Pedro
		
		System.out.println(baby1.hairColor); //null because we didn't assign a property  
		
		baby1.hairColor = "Black";
		System.out.println(baby1.hairColor); //prints Black because it now has a assigned property
		baby1.gender = 'M';

		System.out.println("________________________________________");
		
		//Declaring a variable of type of baby
		
		Baby baby2 = new Baby(); //initialize 
		//creating/initializing a baby and assigning it to the variable
		
		System.out.println("The name of the baby is " + baby2.name);
		
		//assign variables:
		baby2.name = "Aykut";
		baby2.gender = 'M';
		baby2.hairColor = "Red";
		baby2.weight = 5;
		
		System.out.println("The hair color of baby1 is " + baby1.hairColor);
		System.out.println("The hair color of baby2 is " + baby2.hairColor);
		//The hair color of baby1 is Black
		//The hair color of baby2 is Red
		
		
		System.out.println("________________________________________");
		
		baby1.cry();
		baby2.cry();
		//it executed from the class in the crying method section
		//Prints: because the method doesn't have the name variable included 
		//in the crying. For example: 
		//void cry()
		//{
			//System.out.println(name + "Baby is crying");
		//}
		//Baby is crying
		//Baby is crying
		
		baby1.talk();
		//Prints: Pedro Baby is talking
		//because we added name to the talk method in the class 
		
		//order of executing matters in the class that has the main where
		//we are running the software 
		
		baby1.displayInformation();
		baby2.displayInformation();
		//prints: it's pulling from the class in the method section of displayInformation
		//Pedro, gender is M, weight is 18
		//Aykut, gender is M, weight is 5
		
		
		//Java is an object oriented program 
		//every class has a job
		
		
		
		
		
		
		
		
		
		
	}

}
