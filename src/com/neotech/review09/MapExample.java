package com.neotech.review09;


import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		
		//Map
		//HashMap | LinkedHashMap | TreeMap | HashTable
		//random order is printed 
		//in Maps we use .put instead of .add 
		//first one is the key and the second on is the value 
		//The keys are unique so we can't have the same key two times
		//the values can be duplicated 
		//can't Iterate a Map but can move to a set or list by using .keySet
		
		//map has two objects/pair called an entry
		
		Map<Integer, String> phoneBook = new HashMap<Integer, String>();
		

		
		phoneBook.put(1234567, "James Smith");
		phoneBook.put(1234568, "Smith Jones");
		phoneBook.put(1234569, "Bill Street");
		phoneBook.put(1234561, "Julia Roberts");
		
		//it will replace Smith Jones with Ahmet 
		phoneBook.replace(1234568, "Ahmet");
		
		System.out.println(phoneBook);
		
		//Another way to replace 
		phoneBook.put(1234567, "Catherine");
		
		System.out.println(phoneBook);
		
		//Map is one directional, from key to value 
		
		String name = phoneBook.get(1234567);
		
		System.out.println(name + " is calling");
		
		
		boolean containsKey = phoneBook.containsKey(666);
		System.out.println(containsKey);
		
		boolean containsV= phoneBook.containsValue("Bill Street");
		System.out.println(containsV);
		
		phoneBook.remove(1234567); //will remove the pair/entry from my map
		System.out.println(phoneBook);
		
		System.out.println(phoneBook.keySet());
		//Lets get all the keys and store them in a SET 
		
		Set <Integer> numbers = phoneBook.keySet(); //using<Integer> because the key is an integer
		System.out.println(numbers);
		//now that they have been moved into a set we can iterate them, use a for enhanced loop. 
		//because it's a set we can't use a regular for loop. There are no indexes to use for each 
		
		Iterator <Integer> itNumbers = numbers.iterator();
		while(itNumbers.hasNext())
		{
			Integer number = itNumbers.next();
			
			//find the name/value by using the number/key
			String personName= phoneBook.get(number); //this will return a String 
			System.out.println(number + " ---> " + personName);
			
		}
		
		//brings up all the names 
		System.out.println(phoneBook.values());
		
		
		//Get the values and iterate them using an enhanced for loop
		//Try to get the number by using the name!!!
		
		
		//Let's get all the values and store them in a COLLECTION
		Collection <String> names = phoneBook.values();
		
		//we can use an enhanced for loop and iterator(while loop)
		
		System.out.println(names); // only got the names
		
		//to get the names/values 
		for(String element : names)
		{
			System.out.println(element);
			
			//Maps are on directional, from key to value, we can't use the value to get the key
			//phoneBook.get(element); error 
		}
		
		
		
		
		
		
		
	}

}
