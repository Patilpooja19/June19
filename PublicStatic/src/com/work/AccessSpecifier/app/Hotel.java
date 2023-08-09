package com.work.AccessSpecifier.app;

public class Hotel {
	
	public String name;
	public int noOfRooms;
	public String location;
	public float capacity;
	public boolean isGoodService;
	
	public void stay() {
		System.out.println("invoking with no arg");
	}
	
	public void stay(String name) {
		System.out.println("invoking with String arg");
	}
	
	public void stay(String name, int noOfRooms) {
		System.out.println("invoking with String and int arg");
	}
	
	public void stay(String name, int noOfRooms, String location) {
		System.out.println("invoking with String and int arg");
	}
	
	public void stay(String name, int noOfRooms, String location, float capacity) {
		System.out.println("invoking with String and int arg");
	}
	
	public void stay(String name, int noOfRooms, String location, float capacity, boolean isGoodService) {
		System.out.println("invoking with String, int and boolean arg");
	}

}
