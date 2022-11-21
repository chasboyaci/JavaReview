package com.neotech.review08;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<String> asia = new LinkedList<>(); //Up-casting
		{
			asia.add("Japan");
			asia.add("Taiwan");
			asia.add("Turkey");
			asia.add(0,"Cambodia");
			asia.add("Japan");
			
			System.out.println(asia);
			
			//Create a new empty List
			List<String> asia2 = new LinkedList<>();
			for(String country : asia)
			{	
				if(asia2.contains(country)) 
				{
					System.out.println("The country "  + country + " exists in the list");
					
				}else {
					asia2.add(country);
				}
			}
			
			System.out.println("asia2 -> " + asia2);
			
		}
		
System.out.println("---Doing the same with an iterator------");
	List<String> asia3 = new LinkedList<>(); //creating an empty list 
	Iterator<String> iter = asia.iterator();
	
	while(iter.hasNext()) {
		String country = iter.next();
		//add it into the new list ONLY if it is not there yet 
		if(!asia3.contains(country))
		{
			asia3.add(country);
		}
		
		
	}
			System.out.println("asia3--> " + asia3);








		
		
	}

}
