package com.work.AccessSpecifier.app;

public class DangerZoo extends Zoo{

	@Override
	public void adventures() {
		System.out.println("invoking with no arg");
	}
	
	@Override
	public void adventures(String name) {
		System.out.println("invoking with String arg");
	}
	
	@Override
	public void adventures(String name, String loaction) {
		System.out.println("invoking with String arg");
	}
	
	@Override
	public void adventures(String name, String loaction, int noOfAnimals) {
		System.out.println("invoking with String, int arg");
	}
	
	@Override
	public void adventures(String name, String loaction, int noOfAnimals, boolean isSafe) {
		System.out.println("invoking with String, int, boolean arg");
	}
	
	@Override
	public void adventures(String name, String loaction, int noOfAnimals, boolean isSafe, float ticketPrice) {
		System.out.println("invoking with String, int, boolean, float arg");
	}
	
}
