package com.work.AccessSpecifier.app;

public class City {
	
	public String name;
	public int noOfAreas;
	public int noOfPostOffices;
	public float population;
	public boolean isCityClean;
	
	public void address() {
		System.out.println("invoking with no arg");
	}
	
	public void address(String name) {
		System.out.println("invoking with String arg");
	}
	
	public void address(String name, int noOfAreas) {
		System.out.println("invoking with String, int arg");
	}
	
	public void address(String name, int noOfAreas, int noOfPostOffices) {
		System.out.println("invoking with String, int arg");
	}
	
	public void address(String name, int noOfAreas, int noOfPostOffices, float population) {
		System.out.println("invoking with String, int, float arg");
	}
	
	public void address(String name, int noOfAreas, int noOfPostOffices, float population, boolean isCityClean) {
		System.out.println("invoking with String, int, float, boolean arg");
	}

}
