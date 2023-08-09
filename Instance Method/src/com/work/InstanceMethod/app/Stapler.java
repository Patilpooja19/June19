package com.work.InstanceMethod.app;

public class Stapler {
	
	public String brand;
	public int price;

	public void pin() {
		System.out.println("invoking with no arg");
		pin("Stanley");
		pin(220);
	}

	public void pin(String brand) {
		System.out.println("invoking with String arg");
		System.out.println("Brand " + brand);
	}

	public void pin(double price) {
		System.out.println("invoking with double arg");
		System.out.println("Price :" + price);
	}

	public void pin(String brand, double price) {
		System.out.println("invoking with String and double arg");
		pin(brand);
		pin(price);
	}

}
