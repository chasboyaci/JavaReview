package com.neotech.review08;

public class PhoneDemo {

	public static void main(String[] args) {
		
		Phone p = new Phone("S1234", "Samsung", "pas@1234");
		
		p.displayInfo();
		
		String serial = p.getSerialNumber("pass123");
		System.out.println("The serial number is " + serial);
		
		p.setSerialNumber("Allee12");
		p.displayInfo();
		
		System.out.println(p.getSerialNumber("pass@1234"));
		
		System.out.println("______________________");
		
		String phoneBrand = p.getBrand();
				System.out.println("The brand is " + phoneBrand);
				
				
				
			//I can't change the brand because there no setter method 	
			//p.setBrand("Apple");	
				
				
				
				
	}

}
