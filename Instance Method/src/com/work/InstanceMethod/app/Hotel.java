package com.work.InstanceMethod.app;

public class Hotel {
	
	public String service;
	public int noOfRooms;
	
	public void resort()
	{
		System.out.println("invoking resort with no arg");
		resort("full");
		resort(30);
	}
	
	public void resort(String service) {
		System.out.println("invoking resort with String");
		System.out.println("Service "+ service);
	}
	
	public void resort(int noOfRooms)
	{
		System.out.println("invoking resort with int");
		System.out.println("noOfRooms "+ noOfRooms);
	}
	
	public void resort(String service,int noOfRooms)
	{
		System.out.println("invoking resort with string and int");
		resort(service);
		resort(noOfRooms);
	}


}
