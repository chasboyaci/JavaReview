package com.neotech.review09;

import java.util.*;


public class WorldMap {

	public static void main(String[] args) {
		
		Map<String, String> europe = new  TreeMap<>(); //ordered by the key in alpha
		europe.put("Spain", "Madrid");
		europe.put("Germany", "Berlin");
		europe.put("Italy", "Rome");
		
		System.out.println(europe);
		
		
		Map<String, String> africa = new LinkedHashMap<>(); //order is preserved
		
		africa.put("Morrocco", "Rabat");
		africa.put("Egypt", "Cairo");
		africa.put("South Africa", "Johannesburg");
		System.out.println(africa);
		
		Map<String, String> asia = new HashMap<>(); //random order
		
		asia.put("Japan", "Tokyo");
		asia.put("Iran", "Tehran");
		asia.put("Tajikistan", "Dushanbe");
		System.out.println(asia);
		
		System.out.println("_____World_____");

		List<Map<String,String>> world = new ArrayList<>();
		world.add(europe);
		world.add(asia);
		world.add(africa);
		
		System.out.println(world);
		
		System.out.println("world size -> " + world.size()); //3 maps (Asia, Europe, Africa)
		
		Map<String, String > map1 = world.get(1); //get the element with index 1 
		System.out.println(map1); //prints Africa map index 1. it starts counting at index 0 
		
		for(Map<String, String> continent : world)
		{
			//System.out.print(continent+ " ");
			Set<String> countryNames= continent.keySet();
			
			for (String country: countryNames) {
				//System.out.println(country);
				
				String capitalCity = continent.get(country);
				System.out.println(country + " -> " + capitalCity);
				
				
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
	}

}
