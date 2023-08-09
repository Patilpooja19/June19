package com.work.AccessSpecifier.boot;

import com.work.AccessSpecifier.app.Pub;
import com.work.AccessSpecifier.app.RichPub;

public class PubRunner {

	public static void main(String[] args) {
		
		System.out.println("invoking in PubRunner");
		
		Pub ref = new RichPub();
		ref.hangOver();
		
		System.out.println("==============");
		
		RichPub ref1 = new RichPub();
		ref1.hangOver();
		

	}

}
