package com.work.AccessSpecifier.app;

public class NewBakery extends Bakery{
	
	@Override
	public void bake() {
		System.out.println("invoking with no arg");
	}
	
	@Override
	public void bake(String bakeryName) {
		System.out.println("invoking with String arg");
	}
	
	@Override
	public void bake(String bakeryName, float price) {
		System.out.println("invoking with String and float arg");
	}
	
	@Override
	public void bake(String bakeryName, float price, String flavour) {
		System.out.println("invoking with String and float arg");
	}
	
	@Override
	public void bake(String bakeryName, float price, String flavour, char size) {
		System.out.println("invoking with String, float and char arg");
	}
	
	@Override
	public void bake(String bakeryName, float price, String flavour, char size, String location) {
		System.out.println("invoking with String, float and char arg");
	}
	
	

}
