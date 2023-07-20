class Fabric{
	
	static double getPrice(String type)
	{
		System.out.println("invoking getPrice from Fabric");
		
		if(type!=null)
		{
			System.out.println("valid");
			
			if("cotton" == type)
			{
				return 44;
			}
			if("nylon" == type)
			{
				return 36;
			}
			if("woolen" == type)
			{
				return 250;
			}
			if("linen" == type)
			{
				return 65;
			}
			if("polyster" == type)
			{
				return 25;
			}
			if("silk" == type)
			{
				return 697;
			}
		}
		else
		{
			System.err.println("invalid");
		}
		return 0;
	}
}