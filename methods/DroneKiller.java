class DroneKiller{
	
	public static void main(String[] args)
	{
		System.out.println("get Distance By Flight");
		
		double ref=Drone.getDistanceByFlight("Pooja","Annual Day");
		System.out.println("Ref is :"+ref);
		
		
		double ref1=Drone.getPricePerEvent("Diwali");
		System.out.println("Ref is :"+ref1);
		
		
		int ref2=Drone.getDiscountByEvent("Dasara","Sachin");
		System.out.println("Ref is :"+ref2);
		
		
		
	}
}