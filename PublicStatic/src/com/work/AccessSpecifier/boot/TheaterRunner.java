package com.work.AccessSpecifier.boot;

import com.work.AccessSpecifier.app.Theater;
import com.work.AccessSpecifier.app.PvrTheater;

public class TheaterRunner {

	public static void main(String[] args) {
		
		System.out.println("invoking in TheaterRunner");
		
		Theater movie = new PvrTheater();
		movie.cinema();
		
		System.out.println("===========");
		
		PvrTheater ref = new PvrTheater();
		ref.cinema();

	}

}
