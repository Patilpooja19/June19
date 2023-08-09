package com.work.AccessSpecifier.boot;

import com.work.AccessSpecifier.app.City;
import com.work.AccessSpecifier.app.NiceCity;

public class CityRunner {

	public static void main(String[] args) {
		
		System.out.println("invoking in CityRunner");
		
		City ref = new NiceCity();
		ref.address();
		
		System.out.println("===============");
		
		NiceCity ref1 = new NiceCity();
		ref1.address();
		
		

	}

}
