package com.work.override.boot;

import com.work.override.app.*;

public class Ruuner {

	public static void main(String[] args) {
		
		Amoeba swim = new waterAmoeba();
		swim.sea();
		
		System.out.println("============");
		
		Gate design = new ModernGate();
		design.slide();
		
		System.out.println("===============");
		
		Dinosaur huge = new GaintDinosaur();
		huge.sound();
		
		System.out.println("==============");
		
		Flex company = new GlobalFlex();
		company.career();
		
		System.out.println("================");
		
		Mic ref = new SuperMic();
		ref.noise();
		
		System.out.println("==============");
		
		Drum plastic = new LargeDrum();
		plastic.water();
		
		System.out.println("============");
		
		Theater tv = new PvrTheater();
		tv.movie();
		
		System.out.println("============");
		
		Ticket entrance = new OnlineTicket();
		entrance.booking();
		
		

	}

}
