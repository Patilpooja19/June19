package com.work.override.app;

public class LargeDrum extends Drum{
	
	@Override
	public void water() {
		System.out.println("invoking water in LargeDrum");
	}

}
