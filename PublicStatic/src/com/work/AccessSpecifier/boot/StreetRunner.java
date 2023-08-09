package com.work.AccessSpecifier.boot;

import com.work.AccessSpecifier.app.Street;
import com.work.AccessSpecifier.app.NightStreet;

public class StreetRunner {

	public static void main(String[] args) {
		  
		System.out.println("invoking in StreetRunner");
		
		Street ref = new NightStreet();
		ref.walk();
		
		System.out.println("==============");
		
		NightStreet ref1 = new NightStreet();
		ref1.walk();

	}

}
