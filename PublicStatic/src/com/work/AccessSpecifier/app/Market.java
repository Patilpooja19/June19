package com.work.AccessSpecifier.app;

public class Market {
	
	public String name;
	public int noOfStalls;
	public String location;
	public char marketSize;
	public String type;
	
	public void buy() {
		System.out.println("invoking with no arg");
	}
	
	public void buy(String name) {
		System.out.println("invoking with String arg");
	}
	
	public void buy(String name, int noOfStall) {
		System.out.println("invoking with String, int arg");
	}
	
	public void buy(String name, int noOfStall, String location) {
		System.out.println("invoking with String, int arg");
	}
	
	public void buy(String name, int noOfStall, String location, char marketSize) {
		System.out.println("invoking with String, int arg");
	}
	
	public void buy(String name, int noOfStall, String location, char marketSize, String type) {
		System.out.println("invoking with String, int arg");
	}

}
