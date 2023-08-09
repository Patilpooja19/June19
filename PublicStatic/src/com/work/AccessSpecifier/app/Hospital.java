package com.work.AccessSpecifier.app;

public class Hospital {
	
	public String name;
	public float pricePerKid;
	public int noOfDoctors;
	public String location;
	public boolean isServiceGood;
	
	public void treat() {
		System.out.println("invoking with no arg");
	}
	
	public void treat(String name) {
		System.out.println("invoking with String arg");
	}
	
	public void treat(String name, float pricePerKid) {
		System.out.println("invoking with String and float arg");
	}
	
	public void treat(String name, float pricePerKid, int noOfDoctors) {
		System.out.println("invoking with String, float and int arg");
	}
	
	public void treat(String name, float pricePerKid, int noOfDoctors, String location) {
		System.out.println("invoking with String, float and int arg");
	}
	
	public void treat(String name, float pricePerKid, int noOfDoctors, String location, boolean isServiceGood) {
		System.out.println("invoking with String, float, int and boolean arg");
	}

}
