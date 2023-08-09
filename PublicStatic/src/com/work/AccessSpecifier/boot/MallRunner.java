package com.work.AccessSpecifier.boot;

import com.work.AccessSpecifier.app.Mall;
import com.work.AccessSpecifier.app.OrionMall;


public class MallRunner {

	public static void main(String[] args) {
		
		System.out.println("invoking in MallRunner");
		
		Mall enjoy = new OrionMall();
		enjoy.shoping();;
		
		System.out.println("============");
		
		OrionMall ref = new OrionMall();
		ref.shoping();

	}

}
