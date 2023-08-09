package com.work.AccessSpecifier.app;

public class Temple {
	
	public String name;
	public String location;
	public int noOfGodInTemple;
	public boolean isTempleProvidePrasad;
	public String priestName;
	
	public void pray() {
		System.out.println("invoking with no arg");
	}
	
	public void pray(String name) {
		System.out.println("invoking with String arg");
	}
	
	public void pray(String name, String location) {
		System.out.println("invoking with String arg");
	}
	
	public void pray(String name, String location, int noOfGodInTemple) {
		System.out.println("invoking with String, int arg");
	}
	
	public void pray(String name, String location, int noOfGodInTemple, boolean isTempleProvidePrasad) {
		System.out.println("invoking with String, int, boolean arg");
	}
	
	public void pray(String name, String location, int noOfGodInTemple, boolean isTempleProvidePrasad, String priestName) {
		System.out.println("invoking with String, int, boolean arg");
	}
	
	

}
