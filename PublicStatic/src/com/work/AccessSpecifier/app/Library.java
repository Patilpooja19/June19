package com.work.AccessSpecifier.app;

public class Library {
	
	public String name;
	public int noOfBooks;
	public String location;
	public String guard;
	public int timmimg;
	
	public void books() {
		System.out.println("invoking with no arg");
	}
	
	public void books(String name) {
		System.out.println("invoking with String arg");
	}
	
	public void books(String name, int noOfBooks) {
		System.out.println("invoking with String, int arg");
	}
	
	public void books(String name, int noOfBooks, String location) {
		System.out.println("invoking with String, int arg");
	}
	
	public void books(String name, int noOfBooks, String location, String guard) {
		System.out.println("invoking with String, int arg");
	}
	
	public void books(String name, int noOfBooks, String location, String guard, int timmimg) {
		System.out.println("invoking with String, int arg");
	}

}
