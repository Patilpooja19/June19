package com.work.AccessSpecifier.app;

public class VegeatableMarket extends Market{
	
	@Override
	public void buy() {
		System.out.println("invoking with no arg");
	}
	
	@Override
	public void buy(String name) {
		System.out.println("invoking with String arg");
	}
	
	@Override
	public void buy(String name, int noOfStall) {
		System.out.println("invoking with String, int arg");
	}
	
	@Override
	public void buy(String name, int noOfStall, String location) {
		System.out.println("invoking with String, int arg");
	}
	
	@Override
	public void buy(String name, int noOfStall, String location, char marketSize) {
		System.out.println("invoking with String, int arg");
	}
	
	@Override
	public void buy(String name, int noOfStall, String location, char marketSize, String type) {
		System.out.println("invoking with String, int arg");
	}

}
