package com.work.override.app;

public class ModernGate extends Gate{
	
	@Override
	public void slide() {
		System.out.println("invoking slide in ModernGate in Gate");
	}

}
