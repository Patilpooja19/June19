package com.work.AccessSpecifier.app;

public class TownLibrary extends Library{
	
	@Override
	public void books() {
		System.out.println("invoking with no arg");
	}
	
	@Override
	public void books(String name) {
		System.out.println("invoking with String arg");
	}
	
	@Override
	public void books(String name, int noOfBooks) {
		System.out.println("invoking with String, int arg");
	}
	
	@Override
	public void books(String name, int noOfBooks, String location) {
		System.out.println("invoking with String, int arg");
	}
	
	@Override
	public void books(String name, int noOfBooks, String location, String guard) {
		System.out.println("invoking with String, int arg");
	}
	
	@Override
	public void books(String name, int noOfBooks, String location, String guard, int timmimg) {
		System.out.println("invoking with String, int arg");
	}


}
