package com.work.InstanceMethod.boot;

import com.work.InstanceMethod.app.*;

public class Runner {
	
public static void main(String[] args) {
		
		IronBox ref = new IronBox();
		ref.ironBox();
		ref.ironBox("Philips",155);
		
		System.out.println("============");
		
		
		Hotel resort = new Hotel();
		resort.resort();
		resort.resort("low",50);
		
		System.out.println("=============");
		
		Umbrella safe = new Umbrella();
		safe.safe();
		safe.safe("Large",560);
		
		System.out.println("============");
		
		Stapler pin=new Stapler();
		pin.pin();
		pin.pin("Deli",300);
		
		System.out.println("===========");
		
		Gadget device = new Gadget();
		device.device();
		device.device("Laptop",65000);
		
		System.out.println("==============");
		
		Plier holder = new Plier();
		holder.holder();
		holder.holder("Stanley",1800);
		
		System.out.println("==============");
		
		Mouse pointer = new Mouse();
		pointer.pointer();
		pointer.pointer("gyroscopic",1500);
		
		System.out.println("==============");
		
		Elevator lift = new Elevator();
		lift.lift();
		lift.lift("Vaccum",350);
		
		

	}

}
