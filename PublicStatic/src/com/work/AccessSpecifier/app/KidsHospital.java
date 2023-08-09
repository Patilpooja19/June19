package com.work.AccessSpecifier.app;

public class KidsHospital extends Hospital {
	
	@Override
	public void treat() {
		System.out.println("invoking with no arg");
	}
	
	@Override
	public void treat(String name) {
		System.out.println("invoking with String arg");
	}
	
	@Override
	public void treat(String name, float pricePerKid) {
		System.out.println("invoking with String and float arg");
	}
	
	@Override
	public void treat(String name, float pricePerKid, int noOfDoctors) {
		System.out.println("invoking with String, float and int arg");
	}
	
	@Override
	public void treat(String name, float pricePerKid, int noOfDoctors, String location) {
		System.out.println("invoking with String, float and int arg");
	}
	
	@Override
	public void treat(String name, float pricePerKid, int noOfDoctors, String location, boolean isServiceGood) {
		System.out.println("invoking with String, float, int and boolean arg");
	}


}
