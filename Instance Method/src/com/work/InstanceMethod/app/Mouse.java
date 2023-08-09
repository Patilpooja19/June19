package com.work.InstanceMethod.app;

public class Mouse {
	
	public String type;
	public float price;
	
	public void pointer()
	{
		System.out.println("invoking with no arg");
		pointer("laser");
		pointer(2000);
	}
	
	public void pointer(String type)
	{
		System.out.println("invoking with String arg");
		System.out.println("type  " +type);
	}
	
	public void pointer(float price)
	{
		System.out.println("invoking with float arg");
		System.out.println("price  "+price );
	}
	
	public void pointer(String type, float price)
	{
		System.out.println("invoking with string and float arg");
		pointer(type);
		pointer(price);
	}


}
