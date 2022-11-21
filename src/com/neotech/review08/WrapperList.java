package com.neotech.review08;

import java.util.ArrayList;
import java.util.Iterator;

public class WrapperList {

	public static void main(String[] args) {
		
		//ArrayList can only store objects/classes. Can't use primative types 
		//is a class that is implementing the list interface
		ArrayList<Integer> numbers = new ArrayList<>();
		
		
		boolean isEmpty = numbers.isEmpty();
		System.out.println("Is it empty? " + isEmpty);
		System.out.println("The size is -> " + numbers.size()); //getter 
		
		//size is a method of arraylist class
		
		//this is the long way 
		numbers.add(new Integer(5)); //add is a method to add integers into the arraylist 
		numbers.add(6); //auto-boxing
		numbers.add(8);
		numbers.add(1);
		
		System.out.println("The size if --> " + numbers.size());
		
		//List is an Interface
		//Arraylist and linkedList are classes implementing the list interface
		
		boolean contains = numbers.contains(8);
		System.out.println("The the arraylist contain the number 8?"+ contains);
		
		System.out.println(numbers);
		
		//numbers.remove(1); //remove by index
		numbers.remove(new Integer(1)); //remove by object
		System.out.println(numbers);
		
		System.out.println("How can I iterate the whole ArrayList?");
		
		System.out.println("------1st way, normal for loop");
		
	for(int i = 0; i < numbers.size(); i++)
	{
		int element = numbers.get(i); //auto-unboxing
		System.out.println(element);
	}
		
	System.out.println("------2nd way, enhanced for loop");
	
		for(Integer element : numbers)
		{
			System.out.println(element);
		}
		
		System.out.println("------3rd way, iterator");	
		//every arraylist has an iterator
		Iterator <Integer> it = numbers.iterator(); //get the iterator from the list 
		
		//There are 3 methods in the Iterator class
		//it.hasNext(); //this will return if there is a next element or not
		//it.next(); //This will get and return the next element on the list 
		//it.remove();//remove the current element from the list 
		
		System.out.println(it.next()); //in this it gets the first element 
		
		System.out.println(it.next());
		
		System.out.println("_________________");
		
		
		while(it.hasNext()) {
			int element = it.next();
					System.out.println(element);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
