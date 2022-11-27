package com.neotech.review09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	
	//Collection: 
	//List| Set | Queue (Three interfaces which are inheriting Collection interface)
	//each interface is extending from the collection 
	//List has an insertion order and allows duplicates 
	//Set does not have insertion order 
	//Implementation Lists are ArrayList | LinkedList (Two classes implementing the list interface)
	
	//Set:
	//can't store duplicates
	//doesn't promise to keep the insertion order 
	//HashSet | LinkedHashSet | TreeSet (Three classes implementing the list interface)
	//HashSet: are faster, don't care about the insertion order 
	//LinkedHashSet: keeps insertion order 
	//TreeSet: it sorts from smallest to the largest or alphabetically 
	
	public static void main(String[] args) {
	
		//this is an interface:
		Set<String> africaLinked = new LinkedHashSet<>(); //up-casting/ I am declaring a set and creating and storing a LinkedHashSet
		africaLinked.add("Egypt");
		africaLinked.add("Nigeria");
		africaLinked.add("Morrocco");
		africaLinked.add("Ghana");
		
		
		System.out.println(africaLinked); //keeps the insertion order when printing 
		System.out.println(africaLinked.size());

		//We can't add theses to the set because Sets do not accept duplicates 
		africaLinked.add("Nigeria"); 
		africaLinked.add("Morrocco");
		
		
		//africaLinked.add(2,"Zambia"); //we can't add Zambia in a specific spot because the set does not have an index
		
		Set<String> africaTree = new TreeSet<>(africaLinked); 
		
		System.out.println(africaTree); //the order is in alpha. Doesn't keep insertion order 
		
		Set<String> africaHash = new HashSet<>(); 
		africaHash.addAll(africaLinked);
		
		int size = africaHash.size();
		System.out.println(size); //4
		
		System.out.println(africaHash); //prints in random order 
		
		//sets have the following methods : size, add, contains, isEmpty, remove
		
		boolean contains = africaHash.contains("Turkey");
		System.out.println(contains); //false 
		
		boolean isEmpty = africaHash.isEmpty();
		System.out.println(isEmpty); //false 
		
		boolean ableToRemove = africaHash.remove("Turkey");
		System.out.println(ableToRemove);
		//false because Turkey is not in the set 
		
		//Note: We are NOT able to get or add or remove by using index in a set 
		//africaHash.getClass(2);
		
		//How many ways can we interate a set? 
		
		//first way with a for loop. DOES NOT WORK in a SET 
		//BECAUSE WE CAN'T USE AN INDEX
		//for(int i = 0; i <africaHash.size(); i++)
		//{
			//africaHash.get(i);
		//}
		
		//USING Enhanced for loop
		
		for(String africa : africaHash)
		{
			System.out.println(africa);
		}
		
		Iterator <String> africa1 = africaHash.iterator();
		System.out.println(africa1.next());
		
		
		
	}

}
