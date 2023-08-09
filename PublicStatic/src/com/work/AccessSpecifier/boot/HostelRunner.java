package com.work.AccessSpecifier.boot;

import com.work.AccessSpecifier.app.Hostel;
import com.work.AccessSpecifier.app.CollegeHostel;

public class HostelRunner {

	public static void main(String[] args) {
		
		System.out.println("invoking in HostelRunner");
		
		Hostel ref = new CollegeHostel();
		ref.friends();
		
		System.out.println("=============");
		
		CollegeHostel ref1 = new CollegeHostel();
		ref1.friends();
	}

}
