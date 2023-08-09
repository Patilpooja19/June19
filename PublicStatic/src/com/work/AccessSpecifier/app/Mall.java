package com.work.AccessSpecifier.app;

public class Mall {

	public String mall;
	public String location;
	public int noOfStalls;
	public boolean isRatingGood;
	public boolean isEntryFee;
	
	public void shoping() {
		System.out.println("invoking with no arg");
	}
	
	public void shoping(String mall) {
		System.out.println("invoking with String arg");
	}
	
	public void shoping(String mall, String location) {
		System.out.println("invoking with String arg");
	}
	
	public void shoping(String mall, String location, int noOStalls) {
		System.out.println("invoking with String, int arg");
	}
	
	public void shoping(String mall, String location, int noOStalls, boolean isRatingGood) {
		System.out.println("invoking with String, int, boolean arg");
	}
	
	public void shoping(String mall, String location, int noOStalls, boolean isRatingGood, boolean isEntryFee) {
		System.out.println("invoking with String, int, boolean arg");
	}
}
