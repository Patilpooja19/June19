package com.xworkz.Abstract.boot;

import com.xworkz.Abstract.app.Metro;
import com.xworkz.Abstract.app.RailMetro;

public class MetroRunner {

	public static void main(String[] args) {
		
		Metro metro=new RailMetro();
		metro.connectivity();
		metro.isProvideTravel();
		metro.isQuickReach();
		metro.isTraficless();
		metro.lessTime();
		metro.stop();
		metro.moving();
		metro.secure();
		metro.reduceNoOfVehicle();
		

	}

}
