package com.work.AccessSpecifier.app;

public class CustodyPoliceStation extends PoliceStation{
	
	@Override
	public void crime() {
		System.out.println("invoking with no arg");
	}
	
    @Override 
	public void crime(String name) {
		System.out.println("invoking with String arg");
	}
	
    @Override
	public void crime(String name, int noOfPolice) {
		System.out.println("invoking with String, int arg");
	}
	
    @Override
	public void crime(String name, int noOfPolice, float salaryOfPolice) {
		System.out.println("invoking with String, int, float arg");
	}

    @Override
	public void crime(String name, int noOfPolice, float salaryOfPolice, int noOfJail) {
		System.out.println("invoking with String, int, float arg");
	}
	
    @Override
	public void crime(String name, int noOfPolice, float salaryOfPolice, int noOfJail, boolean isGood) {
		System.out.println("invoking with String, int, float arg");
	}


		

	

}
