package com.neotech.review07_Abstraction;

public class World {

	public static void main(String[] args) {
		//since human is an abstract class we can't create an object 
		//Human h1 = new Human("Melih");
		
		
		//Up-casting and down-casting can be done ONLY because of INHERITANCE
		Human a1 = new Albanian("Valbona"); //up casting 
		a1.talk();
		a1.sleep();
		//a1.albanianDance(); can't use this one because it's not in Human

		Human t1 = new Turkish("Vane"); //up-casting 
		t1.talk();
		t1.sleep();
		//t1.makeBaklava(); can't use this because it's not in the human class
		
		//down casting
		Turkish tur = (Turkish) t1;
		tur.makeBaklava();
		
	}

}
