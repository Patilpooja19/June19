package com.work.InstanceMethod.app;

public class IronBox {
	
	public String brand;
	public float weight;

	public void ironBox() {
		System.out.println("invoking lens with no arg");
		ironBox("xyz");
		ironBox(200);
	}
	
	public void ironBox(String brand) {
		System.out.println("invoking with String");
		System.out.println("brand "+ brand);
	}
	
	public void ironBox(float weight) {
		System.out.println("invoking with float");
		System.out.println("weight "+ weight);
	}

	public void ironBox(String brand, float weight) {
		System.out.println("invoking with String and float");
		ironBox(brand);
		ironBox(weight);
	}

}
