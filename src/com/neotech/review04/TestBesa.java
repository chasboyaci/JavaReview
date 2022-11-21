package com.neotech.review04;

public class TestBesa {

	public static void main(String[] args) {
	
		Besa b = new Besa();
		
		b.addTwoNumbers(); //does the cal but no return because of the void
		b.addTwoNumbersThatIGive(5, 7); //does the cal but no return because of the void
		
		int res1 = b.addTwoNumbersAndGiveMeTheResult(); 
		
		//we need to add int res2 = to store the variable
		int res2 = b.addTwoNumbersThatIGiveAndGiveMeTheResult(6, 3); //6 and 3 are the parameters
		
		
		
		
		
		
	}

}
