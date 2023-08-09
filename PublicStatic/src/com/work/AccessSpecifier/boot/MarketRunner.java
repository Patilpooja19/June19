package com.work.AccessSpecifier.boot;

import com.work.AccessSpecifier.app.Market;
import com.work.AccessSpecifier.app.VegeatableMarket;

public class MarketRunner {

	public static void main(String[] args) {
		
		System.out.println("invoking in MarketRunner");
		
		Market ref = new VegeatableMarket();
		ref.buy();
		
		System.out.println("==============");
		
		VegeatableMarket ref1 = new VegeatableMarket();
		ref1.buy();

	}

}
