package com.work.AccessSpecifier.boot;

import com.work.AccessSpecifier.app.Library;
import com.work.AccessSpecifier.app.TownLibrary;

public class LibraryRunner {

	public static void main(String[] args) {
		
		System.out.println("invoking in LibraryRunner");
		
		Library ref = new TownLibrary();
		ref.books();
		
		System.out.println("==============");
		
		TownLibrary ref1 = new TownLibrary();
		ref1.books();

	}

}
