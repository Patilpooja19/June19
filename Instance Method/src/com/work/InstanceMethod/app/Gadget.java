package com.work.InstanceMethod.app;

public class Gadget {
	
	public String type;
	public double price;
	
	
	public void device()
	{
		System.out.println("invoking with no arg");
		device("Mobile");
		device(11500);
	}
	
	public void device(String type)
	{
		System.out.println("invoking with String arg");
		System.out.println("Type :"+type);
	}
	
	public void device(double price)
	{
		System.out.println("invoking with double arg");
		System.out.println("Price :"+price);
	}
	
	public void device(String type,double price)
	{
		System.out.println("invoking with string and double arg");
		device(type);
		device(price);
	}
	

}
