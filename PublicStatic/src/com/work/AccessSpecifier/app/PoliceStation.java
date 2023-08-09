package com.work.AccessSpecifier.app;

public class PoliceStation {
	
	public String name;
	public int noOfPolice;
	public float salaryOfPolice;
	public int noOfJail;
	public boolean isGood;
	
	public void crime() {
		System.out.println("invoking with no arg");
	}

	public void crime(String name) {
		System.out.println("invoking with String arg");
	}
	
	public void crime(String name, int noOfPolice) {
		System.out.println("invoking with String, int arg");
	}
	
	public void crime(String name, int noOfPolice, float salaryOfPolice) {
		System.out.println("invoking with String, int, float arg");
	}

	public void crime(String name, int noOfPolice, float salaryOfPolice, int noOfJail) {
		System.out.println("invoking with String, int, float arg");
	}
	
	public void crime(String name, int noOfPolice, float salaryOfPolice, int noOfJail, boolean isGood) {
		System.out.println("invoking with String, int, float arg");
	}
}
