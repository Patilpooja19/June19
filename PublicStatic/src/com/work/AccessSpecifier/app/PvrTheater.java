package com.work.AccessSpecifier.app;

public class PvrTheater extends Theater{
	
	@Override
	public void cinema() {
		System.out.println("invoking with no arg");
	}
	
	@Override
	public void cinema(String name) {
		System.out.println("invoking with String arg");
	}
	
	@Override
	public void cinema(String name, float price) {
		System.out.println("invoking with String, float arg");
	}
	
	@Override
	public void cinema(String name, float price, int noOfSeats) {
		System.out.println("invoking with String, float, int arg");
	}
	
	@Override
	public void cinema(String name, float price, int noOfSeats, String movieReleased) {
		System.out.println("invoking with String, float, int arg");
	}
	
	@Override
	public void cinema(String name, float price, int noOfSeats, String movieReleased, String location) {
		System.out.println("invoking with String, float, int arg");
	}


}
