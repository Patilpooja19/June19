package com.work.override.app;

public class OnlineTicket extends Ticket {
	
	@Override
	public void booking() {
		System.out.println("invoking booking in OnlineTicket");
	}

}
