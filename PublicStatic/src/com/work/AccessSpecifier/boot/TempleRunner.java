package com.work.AccessSpecifier.boot;

import com.work.AccessSpecifier.app.Temple;
import com.work.AccessSpecifier.app.AncientTemple;

public class TempleRunner {

	public static void main(String[] args) {
		
		System.out.println("invoking in TempleRunner");
		
		Temple ref = new AncientTemple();
		ref.pray();
		
		System.out.println("==============");
		
		AncientTemple ref1 = new AncientTemple();
		ref1.pray();
		
		

	}

}
