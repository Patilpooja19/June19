package com.work.AccessSpecifier.app;

public class Theater {

	public String name;
	public float price;
	public int noOfSeats;
	public String movieReleased;
	public String location;
	
	public void cinema() {
		System.out.println("invoking with no arg");
	}
	
	public void cinema(String name) {
		System.out.println("invoking with String arg");
	}
	
	public void cinema(String name, float price) {
		System.out.println("invoking with String, float arg");
	}
	
	public void cinema(String name, float price, int noOfSeats) {
		System.out.println("invoking with String, float, int arg");
	}
	
	public void cinema(String name, float price, int noOfSeats, String movieReleased) {
		System.out.println("invoking with String, float, int arg");
	}
	
	public void cinema(String name, float price, int noOfSeats, String movieReleased, String location) {
		System.out.println("invoking with String, float, int arg");
	}

}
