package com.work.override.app;

public class SuperMic extends Mic{
	
	@Override
	public void noise() {
		System.out.println("invoking noise in SuperMic");
	}

}
