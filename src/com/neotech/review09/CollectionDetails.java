package com.neotech.review09;


import java.util.*; //command shift o to import than change it to java.util.*;

public class CollectionDetails {

	public static void main(String[] args) {
		
		//1.List preserves insertion order, BUT SET DOES NOT
		//2. List contains duplicates, BUT SET contains UNIQUE objects 

		//Collection is an interface 
		//Collection framework ---All interfaces and implementations (Lists = ArrayList, LinkedSet) (Set = HashSet & LinkedHashSet)
		//Collection Interface - OnlY ONE INTERFACE 
		//Collections ---it is a helper/utility class
		
		Set<Integer> numbers = new HashSet<>();
		
		numbers.add(98);
		numbers.add(18);
		numbers.add(54);
		numbers.add(34);
		numbers.add(22);
		numbers.add(95);
		
		System.out.println(numbers); //prints in random order 
		
		//Collections is a Class under Java util tool 
		Integer min = Collections.min(numbers);
		System.out.println(min); //18
		
		System.out.println(Collections.max(numbers)); //98
		
		
		//Collections.sort(numbers); can't sort a set because there's no list 
		
		
		//List can be sorted 
		List<Integer> numberList = new ArrayList <>(numbers);
		System.out.println("List before sorting -> " + numberList);
		
		Collections.sort(numberList); //it's static 
		System.out.println("List after sorting -> " + numberList);
		
		
		List<String> students = new LinkedList<>();
		
		students.add("Allee");
		students.add("Sophie");
		students.add("Catherine");
		students.add("Ahmet");
		students.add("Busra");
		students.add("Seda");
		
		System.out.println(students); //it's a list so it follows insertion order 
		
		String first = Collections.min(students);
		System.out.println("first ->" + first);
		
		System.out.println("last -> " + Collections.max(students));
		
		System.out.println(students); //[Allee, Sophie, Catherine, Ahmet, Busra, Seda]
		
		Collections.sort(students);
		System.out.println(students); //[Ahmet, Allee, Busra, Catherine, Seda, Sophie]
		
		int[] arr = {9,2,8,5,1}; //can't add to an array later on 
		//with a list you can add, remove, and change order 
		
		Arrays.sort(arr); //Arrays is a class and it helps us to sort
		
		for(int n : arr)
		{
			System.out.print(n + " "); //1 2 5 8 9 because we used Arrays.sort(arr); 
		}
		
		
	}

}
