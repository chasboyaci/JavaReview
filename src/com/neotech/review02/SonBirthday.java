package com.neotech.review02;

public class SonBirthday {

	public static void main(String[] args) {

		// I want to celebrate my son's birthdays from 11 to 20 (Use for loop)
		// but not 13th birthday, because we are scared
		// Let's use for loop
		
		
		for(int age = 11; age <= 20; age++)
		{
			if(age == 13)
			{
				continue;
			}
			System.out.println("We are celebrating your " + age + " birthday");
		}
			System.out.println();
	}

}
