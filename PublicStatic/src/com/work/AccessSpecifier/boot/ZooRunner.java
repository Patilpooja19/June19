package com.work.AccessSpecifier.boot;

import com.work.AccessSpecifier.app.Zoo;
import com.work.AccessSpecifier.app.DangerZoo;

public class ZooRunner {

	public static void main(String[] args) {
		
		System.out.println("invoking in ZooRunner");
		
		Zoo ref = new DangerZoo();
		ref.adventures();
		
		System.out.println("==============");
		
		DangerZoo ref1 = new DangerZoo();
		ref1.adventures();
		
		

	}

}
