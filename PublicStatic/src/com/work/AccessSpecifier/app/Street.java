package com.work.AccessSpecifier.app;

public class Street {
	
	public String name;
	public int noOfWays;
	public int noOfLights;
	public String location;
	public int noOfBenches;
	
	public void walk() {
		System.out.println("invoking with no arg");
	}
	
	public void walk(String name) {
		System.out.println("invoking with String arg");
	}
	
	public void walk(String name, int noOfWays) {
		System.out.println("invoking with String, int arg");
	}
	
	public void walk(String name, int noOfWays, int noOfLights) {
		System.out.println("invoking with String, int arg");
	}
	
	public void walk(String name, int noOfWays, int noOfLights, String location) {
		System.out.println("invoking with String, int arg");
	}
	
	public void walk(String name, int noOfWays, int noOfLights, String location, int noOfBenches) {
		System.out.println("invoking with String, int arg");
	}

}
