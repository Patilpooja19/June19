package com.work.AccessSpecifier.app;

public class Hostel {
	
	public String name;
	public int noOfRooms;
	public String location;
	public boolean isFoodGood;
	public int noOfWarden;
	
	public void friends() {
		System.out.println("invoking with no arg");
	}
	
	public void friends(String name) {
		System.out.println("invoking with String arg");
	}
	
	public void friends(String name, int noOfRooms) {
		System.out.println("invoking with String, int arg");
	}
	
	public void friends(String name, int noOfRooms, String location) {
		System.out.println("invoking with String, int arg");
	}
	
	public void friends(String name, int noOfRooms, String location, boolean isFoodGood) {
		System.out.println("invoking with String, int, boolean arg");
	}
	
	public void friends(String name, int noOfRooms, String location, boolean isFoodGood, int noOfWarden) {
		System.out.println("invoking with String, int, boolean arg");
	}

}
