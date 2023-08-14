package com.xworkz.Abstract.app;

public class RailMetro extends Metro {
	
	@Override
	public boolean connectivity() {
		return false;
	}
	@Override
	public boolean lessTime() {
		return false;
	}
	@Override
	public boolean reduceNoOfVehicle() {
		return false;
	}
	@Override
	public boolean secure() {
		return false;
	}
	@Override
	public boolean stop() {
		return false;
	}	

}
