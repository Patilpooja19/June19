package com.work.AccessSpecifier.boot;

import com.work.AccessSpecifier.app.Hotel;
import com.work.AccessSpecifier.app.ShantiSagarHotel;

public class HotelRunner {

	public static void main(String[] args) {
		
		System.out.println("invoking in HotelRunner");
		
		Hotel mast = new ShantiSagarHotel();
		mast.stay();
		
		
		System.out.println("==============");
		
		ShantiSagarHotel cool = new ShantiSagarHotel();
		cool.stay();
		
		

	}

}
