package com.neotech.review02;

import java.util.Scanner;

public class VendingMachine2 {

	public static void main(String[] args) {
		
	    int quarters, dimes, nickels, pennies;
	    int money = 0;
	    quarters = money / 25;
	    money = money - quarters * 25;
	    dimes = money / 10;
	    money = money - dimes * 10;
	    nickels = money / 5;
	    money = money - nickels * 5;
	    pennies = money;

	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter cents:");
	    money = scan.nextInt();

	    
	    if (money > 0 && money < 100)
	  
      {
	      System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, " + "and " + pennies + " pennies");
        }
      else
      {
	      System.out.println("Invalid cents amount");
	    }

	}

}
