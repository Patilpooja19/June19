package com.work.InstanceMethod.app;

public class Elevator {
	
	public String type;
	public int speedInFpm;
	
	public void lift()
	{
		System.out.println("invoking with no arg");
		lift("Hydraulic");
		lift(200);
	}
	
	public void lift(String type)
	{
		System.out.println("invoking with String arg");
		System.out.println("type : "+type);
	}
	
	public void lift(int speedInFpm)
	{
		System.out.println("invoking with int arg");
		System.out.println("speedInFpm  "+speedInFpm);
	}
	
	public void lift(String type,int capacity)
	{
		System.out.println("invoking with string and int arg");
		lift(type);
		lift(speedInFpm);
	}


}
