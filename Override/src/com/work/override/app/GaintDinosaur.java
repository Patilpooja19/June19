package com.work.override.app;

public class GaintDinosaur extends Dinosaur{
	
	@Override
	public void sound() {
		System.out.println("invoking sound in GaintDinosaur");
	}

}
