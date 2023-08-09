package com.work.AccessSpecifier.app;

public class NiceCity extends City{
	
	@Override
	public void address() {
		System.out.println("invoking with no arg");
	}
	
	@Override
	public void address(String name) {
		System.out.println("invoking with String arg");
	}
	
	@Override
	public void address(String name, int noOfAreas) {
		System.out.println("invoking with String, int arg");
	}
	
	@Override
	public void address(String name, int noOfAreas, int noOfPostOffices) {
		System.out.println("invoking with String, int arg");
	}
	
	@Override
	public void address(String name, int noOfAreas, int noOfPostOffices, float population) {
		System.out.println("invoking with String, int, float arg");
	}
	
	@Override
	public void address(String name, int noOfAreas, int noOfPostOffices, float population, boolean isCityClean) {
		System.out.println("invoking with String, int, float, boolean arg");
	}


}
