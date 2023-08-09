package com.work.InstanceMethod.app;

public class Plier {
	
	public String brand;
	public float price;
	
	public void holder()
	{
		System.out.println("invoking with no arg");
		holder("Deli");
		holder(484);
	}
	
	public void holder(String brand) {
		System.out.println("invoking with String arg");
		System.out.println("Brand " +brand);
	}
	
	public void holder(float price)
	{
		System.out.println("invoking with char arg");
		System.out.println("Price " +price);
	}
	
	public void holder(String brand,float price)
	{
		System.out.println("invoking with String and float arg");
		holder(brand);
		holder(price);
	}


}
