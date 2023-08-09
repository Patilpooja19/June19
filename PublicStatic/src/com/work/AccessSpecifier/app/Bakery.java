package com.work.AccessSpecifier.app;

public class Bakery {
	
	public String bakeryName;
	public float price;
	public String flavour;
	public char size;
	public String location;
	
	public void bake() {
		System.out.println("invoking with no arg");
	}
	
	public void bake(String bakeryName) {
		System.out.println("invoking with String arg");
	}
	
	public void bake(String bakeryName, float price) {
		System.out.println("invoking with String and float arg");
	}
	
	public void bake(String bakeryName, float price, String flavour) {
		System.out.println("invoking with String and float arg");
	}
	
	public void bake(String bakeryName, float price, String flavour, char size) {
		System.out.println("invoking with String, float and char arg");
	}
	
	public void bake(String bakeryName, float price, String flavour, char size, String location) {
		System.out.println("invoking with String, float and char arg");
	}
	

}
