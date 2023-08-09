package com.work.AccessSpecifier.app;

public class ShantiSagarHotel extends Hotel {
	
	@Override
	public void stay() {
		System.out.println("invoking with no arg");
	}
	
	@Override
	public void stay(String name) {
		System.out.println("invoking with String arg");
	}
	
	@Override
	public void stay(String name, int noOfRooms) {
		System.out.println("invoking with String and int arg");
	}
	
	@Override
	public void stay(String name, int noOfRooms, String location) {
		System.out.println("invoking with String and int arg");
	}
	
	@Override
	public void stay(String name, int noOfRooms, String location, float capacity) {
		System.out.println("invoking with String and int arg");
	}
	
	@Override
	public void stay(String name, int noOfRooms, String location, float capacity, boolean isGoodService) {
		System.out.println("invoking with String, int and boolean arg");
	}

}
