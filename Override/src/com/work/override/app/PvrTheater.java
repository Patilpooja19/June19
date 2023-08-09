package com.work.override.app;

public class PvrTheater extends Theater{
	
	@Override
	public void movie() {
		System.out.println("invoking movie in PvrTheater");
	}

}
