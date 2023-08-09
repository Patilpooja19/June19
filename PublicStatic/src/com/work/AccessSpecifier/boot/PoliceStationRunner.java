package com.work.AccessSpecifier.boot;

import com.work.AccessSpecifier.app.PoliceStation;
import com.work.AccessSpecifier.app.CustodyPoliceStation;

public class PoliceStationRunner {

	public static void main(String[] args) {
		
		System.out.println("invoking in PoliceStationRunner");
		
		PoliceStation ref = new CustodyPoliceStation();
		ref.crime();
		
		System.out.println("==============");
		
		CustodyPoliceStation ref1 = new CustodyPoliceStation();
		ref1.crime();
		

	}

}
