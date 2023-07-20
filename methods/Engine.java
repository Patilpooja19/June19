class Engine{
	
	static int getCCModel(String car)
	{
		System.out.println("Invoking getCCModel from Engine");
		
		if(car!=null)
		{
			System.out.println("valid");
			
			if("Swift" == car)
			{
				return 1197;
			}
			if("Rapid" == car)
			{
				return 1498;
			}
			if("BMW" == car)
			{
				return 2998;
			}
			if("Benz" == car)
			{
				return 1993;
			}
			if("Audi" == car)
			{
				return 1395;
			}
			if("Bently" == car)
			{
				return 3993;
			}
		}
		else
		{
				System.err.println("invalid");
		}
		return 0;
		}
		
	
}