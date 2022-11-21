package com.neotech.review04;

public class StringMethods {

	public static void main(String[] args) {
		
		String str = "Hola";
		
		System.out.println(str.length()); //prints 4 which is the length. The length is a method
		
		System.out.println(str.isEmpty()); //returns a boolean. It prints false because there are characters
		
		System.out.println(str.toUpperCase()); //prints HOLA. Changes the String to all upper case
		
		System.out.println(str.toLowerCase()); //prints hola. Changes the String to all lower case
		
		System.out.println(str); //prints Hola. The toUpperCase and toLowerCase does not reassign. That's why it prints the original String str= "Hola"
		
		boolean equalOrNot= str.equals("hola");
		System.out.println(equalOrNot); //prints false because Java is case sensitive
		
		boolean equals = str.equalsIgnoreCase("hola");
		System.out.println(equals); //prints true 
		 //or 
		
		System.out.println(str.equalsIgnoreCase("hola")); //prints true. this will ignore if it's lower or upper case 
		
		
		System.out.println("____________________________________________________");
		//does Hola contain ol? true or false 
		System.out.println(str.contains("ol")); //true
		
		
		System.out.println("HOLA".toLowerCase()); //prints hola
		
		System.out.println(str.contains("OL".toLowerCase())); //true
		
		boolean starts = str.startsWith("p");
		System.out.println(starts); //prints false 
		
		System.out.println("Does Hola start with Ho?");
		System.out.println(str.startsWith("Ho")); //prints true 
		
		
		System.out.println("Does Hola start with Hola?");
		System.out.println(str.startsWith("Hola")); //prints true 

		//concatunate
		String name = "Catherine" + "-" + "Allee";
		System.out.println(name); //prints Catherine - Allee
		
		String name2 = "Catherine".concat("-").concat("Allee"); //method chaining
		System.out.println(name2); //Catherine-Allee
		
		//method chaining
		String name3= "Catherine".toUpperCase().concat("-").concat("Allee");
		System.out.println(name3); //CATHERINE-Allee
		
		//"Catherine".length().concat("Allee"); //compile error. cant concat a int
		//9.concat(Allee)
		
		System.out.println("Catherine".length()+2); //prints 11. length of Catherine plus 2 = 11
		
		
		System.out.println("____________________________________________________");
		
		
		String str2 = "       Allee Hasboyaci        ";
		
		System.out.println(str2.trim()); //prints Allee Hasboyaci without the space before and after the text
		System.out.println(str2.trim().length()); //prints 15. It counts only the character and the space between. Does not count what the trim method removed. 
		
		System.out.println("____________________________________________________");
		
		String str3 = "Carmen Martinez";
		char letter = str3.charAt(3);
		System.out.println(letter); //prints m the third character in the string 
		
		
		//get the index of a letter
		str3.indexOf('z'); 
		System.out.println(str3.indexOf('z')); //prints 14 starts counting at 0 and skips the space
		
		//get the index for the second 'a'
		int indexOfSecondA = str3.indexOf('a', 4);
		System.out.println(indexOfSecondA); //prints 8
		
		
		
		
		
		
		
		
		
		
		
	}

}
