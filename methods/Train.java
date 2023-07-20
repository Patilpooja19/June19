class Train{
	
	static String getTrainName(int trainNo)
	{
		System.out.println("invoking getTrainName from trainNo");
		
		if(trainNo!=null)
		{
			System.out.println("valid");
			
			if(11013 == trainNo)
			{
				return "Coimbatore Express ";
			}
			if(11014 == trainNo)
			{
				return "Lokmanya Tt Express ";
			}
			if(12134 == trainNo)
			{
				return "Mumbai Express ";
			}
			if(22691 == trainNo)
			{
				return "Rajdhani Express ";
			}
		}
		else
		{
			System.err.println("invalid");
		}
		return "yes";
	}
}