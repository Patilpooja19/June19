package com.work.AccessSpecifier.app;

public class NightStreet extends Street{
	
	@Override
	public void walk() {
		System.out.println("invoking with no arg");
	}
	
	@Override
	public void walk(String name) {
		System.out.println("invoking with String arg");
	}
	
	@Override
	public void walk(String name, int noOfWays) {
		System.out.println("invoking with String, int arg");
	}
	
	@Override
	public void walk(String name, int noOfWays, int noOfLights) {
		System.out.println("invoking with String, int arg");
	}
	
	@Override
	public void walk(String name, int noOfWays, int noOfLights, String location) {
		System.out.println("invoking with String, int arg");
	}
	
	@Override
	public void walk(String name, int noOfWays, int noOfLights, String location, int noOfBenches) {
		System.out.println("invoking with String, int arg");
	}


}
