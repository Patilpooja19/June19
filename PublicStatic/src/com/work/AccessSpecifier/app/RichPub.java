package com.work.AccessSpecifier.app;

public class RichPub extends Pub{

	@Override
	public void hangOver() {
		System.out.println("invoking with no arg");
	}
	
	@Override
	public void hangOver(String name) {
		System.out.println("invoking with String arg");
	}
	
	@Override
	public void hangOver(String name, String location) {
		System.out.println("invoking with String arg");
	}
	
	@Override
	public void hangOver(String name, String location, int noOfCapacity) {
		System.out.println("invoking with String, int  arg");
	}
	
	@Override
	public void hangOver(String name, String location, int noOfCapacity, int noOfBrands) {
		System.out.println("invoking with String, int  arg");
	}
	
	@Override
	public void hangOver(String name, String location, int noOfCapacity, int noOfBrands, boolean isHavingLicense) {
		System.out.println("invoking with String, int  arg");
	}
}
