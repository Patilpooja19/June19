package com.work.AccessSpecifier.app;

public class AncientTemple extends Temple {

	@Override
	public void pray() {
		System.out.println("invoking with no arg");
	}
	
	@Override
	public void pray(String name) {
		System.out.println("invoking with String arg");
	}
	
	@Override
	public void pray(String name, String location) {
		System.out.println("invoking with String arg");
	}
	
	@Override
	public void pray(String name, String location, int noOfGodInTemple) {
		System.out.println("invoking with String, int arg");
	}
	
	@Override
	public void pray(String name, String location, int noOfGodInTemple, boolean isTempleProvidePrasad) {
		System.out.println("invoking with String, int, boolean arg");
	}
	
	@Override
	public void pray(String name, String location, int noOfGodInTemple, boolean isTempleProvidePrasad, String priestName) {
		System.out.println("invoking with String, int, boolean arg");
	}
}
