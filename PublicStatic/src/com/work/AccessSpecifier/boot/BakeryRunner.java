package com.work.AccessSpecifier.boot;

import com.work.AccessSpecifier.app.Bakery;
import com.work.AccessSpecifier.app.NewBakery;

public class BakeryRunner {

	public static void main(String[] args) {
		
		System.out.println("invoking in BakeryRunner");
		
		Bakery cake = new NewBakery();
		cake.bake();
		
		System.out.println("================");
		
		NewBakery bake = new NewBakery();
		bake.bake();
		
		

	}

}
