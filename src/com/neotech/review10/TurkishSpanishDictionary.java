package com.neotech.review10;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TurkishSpanishDictionary {

	public static void main(String[] args) {
		
		Map<String, String> dictionary = new TreeMap<>();
		dictionary.put("ev", "casa");
		dictionary.put("kedi", "gato");
		dictionary.put("esek", "burro");
		dictionary.put("bayrak", "bandera");
		dictionary.put("barsaf", "bandera");
		dictionary.put("carsaf", "bandera");
		
		System.out.println(dictionary);
		
		//Set -> No duplicates
		//List -> Insertion order is perserved
		Set<String> turkishWords = dictionary.keySet();
		
		System.out.println("keys -> " + turkishWords);

	}

}
