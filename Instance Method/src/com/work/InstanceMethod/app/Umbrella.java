package com.work.InstanceMethod.app;

public class Umbrella {
	
	public String type;
	public double price;
	
	public void safe()
	{
		System.out.println("invoking with no arg");
		safe("Small");
		safe(250);
	}
	
	public void safe(String type)
	{
		System.out.println("invoking with String arg");
		System.out.println("type " + type);
	}
	
	public void safe(double price)
	{
		System.out.println("invoking with double arg");
		System.out.println("Price :"+price);
	}
	
	public void safe(String type,double price)
	{
		System.out.println("invoking with String and double arg");
		safe(type);
		safe(price);
	}


}
