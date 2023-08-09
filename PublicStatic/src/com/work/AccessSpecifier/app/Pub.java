package com.work.AccessSpecifier.app;

public class Pub {
	
	public String name;
	public String location;
	public int noOfCapacity;
	public int noOfBrands;
	public boolean isHavingLicense;
	
	public void hangOver() {
		System.out.println("invoking with no arg");
	}
	
	public void hangOver(String name) {
		System.out.println("invoking with String arg");
	}
	
	public void hangOver(String name, String location) {
		System.out.println("invoking with String arg");
	}
	
	public void hangOver(String name, String location, int noOfCapacity) {
		System.out.println("invoking with String, int  arg");
	}
	
	public void hangOver(String name, String location, int noOfCapacity, int noOfBrands) {
		System.out.println("invoking with String, int  arg");
	}
	
	public void hangOver(String name, String location, int noOfCapacity, int noOfBrands, boolean isHavingLicense) {
		System.out.println("invoking with String, int  arg");
	}


}
