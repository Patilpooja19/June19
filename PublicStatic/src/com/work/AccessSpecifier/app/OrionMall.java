package com.work.AccessSpecifier.app;

public class OrionMall extends Mall {
	
	@Override
	public void shoping() {
		System.out.println("invoking with no arg");
	}
	
	@Override
	public void shoping(String mall) {
		System.out.println("invoking with String arg");
	}
	
	@Override
	public void shoping(String mall, String location) {
		System.out.println("invoking with String arg");
	}
	
	@Override 
	public void shoping(String mall, String location, int noOStalls) {
		System.out.println("invoking with String, int arg");
	}
	
	@Override
	public void shoping(String mall, String location, int noOStalls, boolean isRatingGood) {
		System.out.println("invoking with String, int, boolean arg");
	}
	
	@Override
	public void shoping(String mall, String location, int noOStalls, boolean isRatingGood, boolean isEntryFee) {
		System.out.println("invoking with String, int, boolean arg");
	}

}
