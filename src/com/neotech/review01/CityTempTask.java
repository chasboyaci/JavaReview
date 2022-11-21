package com.neotech.review01;

import java.util.Scanner;

public class CityTempTask {

	public static void main(String[] args) {
		
/*
 * Create a Java program that will ask user to input city and temperature. Your
 * program should convert Fahrenheit into celsius and print “The temperature is
 * the city __ is __”
*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What city do you live in?");
		String city = input.next();
		
		System.out.println("What is the tempeture in your city in Fahrenheit?");
		double temp = input.nextDouble();
		
		System.out.println("The temperature in " + city + " is " + 
		((temp-32)*.5556) + " celsius");
		
		
		
		
		

	}

}
