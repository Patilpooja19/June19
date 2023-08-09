package com.work.AccessSpecifier.app;

public class Zoo {

	public String name;
	public String loaction;
	public int noOfAnimals;
	public boolean isSafe;
	public float ticketPrice;
	
	public void adventures() {
		System.out.println("invoking with no arg");
	}
	
	public void adventures(String name) {
		System.out.println("invoking with String arg");
	}
	
	public void adventures(String name, String loaction) {
		System.out.println("invoking with String arg");
	}
	
	public void adventures(String name, String loaction, int noOfAnimals) {
		System.out.println("invoking with String, int arg");
	}
	
	public void adventures(String name, String loaction, int noOfAnimals, boolean isSafe) {
		System.out.println("invoking with String, int, boolean arg");
	}
	
	public void adventures(String name, String loaction, int noOfAnimals, boolean isSafe, float ticketPrice) {
		System.out.println("invoking with String, int, boolean, float arg");
	}
}
