class Drone{
	
	static double getDistanceByFlight(String operator, String event)
	{

		if(operator!=null )
		{
			System.out.println("operator is valid");
			
			if(operator=="Pooja")
			{
				System.out.println("operator is :"+operator);
				return 10;
			}
			
			if(event=="Annual Day")
			{
				System.out.println("event is :"+event);
				return 10;
			}
			
			
		}
		else
		{
			System.out.println("operator is invalid");
			return 1;
		}
		
		
		return 0;
	}
	
	
	static double getPricePerEvent(String eventName)
	{
		
		if(eventName!=null)
		{
			System.out.println("eventName is valid");
		
		if(eventName=="Diwali")
		{
			System.out.println("eventName "+ eventName);
			return 30000;
		}
		return 1;
		}
		else
		{
			System.err.println("eventName is invalid");
			return 2;
		}
	}
	
	
	static int getDiscountByEvent(String eventName,String refPerson)
	{
		
		if(eventName!=null )
		{
			System.out.println("eventName & refPerson is valid");
			
			if(eventName=="Dasara")
			{
				System.out.println("eventName is:"+eventName);
				return 45;
			}
			
			if(refPerson=="Sachin")
			{
				System.out.println("refPerson is:"+refPerson);
				return 45;
			}
			return 6;
		}
			
			else
			{
				System.err.println("eventName is invalid");
				return 50;
			}
		}
		
		/*public static void main(String[] args)
		{
	
		System.out.println("get Distance By Flight");
		
		double ref=Drone.getDistanceByFlight("Pooja","Annual Day");
		System.out.println("Ref is :"+ref);
		
		
		double ref1=Drone.getPricePerEvent("Diwali");
		System.out.println("Ref is :"+ref1);
		
		
		int ref2=Drone.getDiscountByEvent("Dasara","Sachin");
		System.out.println("Ref is :"+ref2);
		
		}*/
		
		
		
	
	

}