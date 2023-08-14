package com.xworkz.Abstract.boot;

import com.xworkz.Abstract.app.Movie;
import com.xworkz.Abstract.app.MovieTeaser;

public class MovieRunner {
	
	public static void main(String[] args) {
	
	System.out.print("involing main in MovieRunner ");
	
	Movie movie = new MovieTeaser();
	movie.enjoy();
	movie.expreesion();
	movie.inspiration();
	movie.sound();
	movie.speedTime();
	movie.suspense();
	movie.music();
	movie.speedTime();
	movie.thriller();
	movie.visualArt();
}
}



