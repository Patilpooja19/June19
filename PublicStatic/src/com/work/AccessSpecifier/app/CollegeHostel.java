package com.work.AccessSpecifier.app;

public class CollegeHostel extends Hostel{
	
	@Override
	public void friends() {
		System.out.println("invoking with no arg");
	}
	
	@Override
	public void friends(String name) {
		System.out.println("invoking with String arg");
	}
	
	@Override
	public void friends(String name, int noOfRooms) {
		System.out.println("invoking with String, int arg");
	}
	
	@Override
	public void friends(String name, int noOfRooms, String location) {
		System.out.println("invoking with String, int arg");
	}
	
	@Override
	public void friends(String name, int noOfRooms, String location, boolean isFoodGood) {
		System.out.println("invoking with String, int, boolean arg");
	}
	
	@Override
	public void friends(String name, int noOfRooms, String location, boolean isFoodGood, int noOfWarden) {
		System.out.println("invoking with String, int, boolean arg");
	}

}
