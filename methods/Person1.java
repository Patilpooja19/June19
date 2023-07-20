class Person1{
	
	static float getAgeByName(String name)
	{
		System.out.println("invoking getAgeByName from Person");
		
		if(name!=null)
		{
			
			System.out.println("valid");
			
			if("navika" == name)
			{
				return 5;
			}
			if("advika" == name)
			{
				return 11;
			}
			if("varun" == name)
			{
				return 18;
			}
			if("tarun" == name)
			{
				return 16;
			}
			if("sachin" == name)
			{
				return 21;
			}
			if("pooja" == name)
			{
				return 22;
			}
			if("sana" == name)
			{
				return 24;
			}
			if("shivani" == name)
			{
				return 23;
			}
			if("pinky" == name)
			{
				return 35;
			}
			if("merry" == name)
			{
				return 2;
			}
		}
		else
		{
			System.err.println("invalid");
		}
		return 0;
	}
	static String getEmailByName(String email)
	{
		System.out.println("invoking getEmailByName from Person");
		
		if(email!=null)
		{
			
			System.out.println("valid");
			
			if("john" == email)
			{
				return "navika@gmail.com";
			}
			if("advika" == email)
			{
				return "advika@gmail.com";
			}
			if("varun" == email)
			{
				return "varun@gmail.com";
			}
			if("tarun" == email)
			{
				return "tarun@gmail.com";
			}
			if("sachin" == email)
			{
				return "sachin@gmail.com";
			}
			if("pooja" == email)
			{
				return "pooja@gmail.com";
			}
			if("sana" == email)
			{
				return "sana@gmail.com";
			}
			if("shivani" == email)
			{
				return "shivani@gmail.com";
			}
			if("pinky" == email)
			{
				return "pinky@gmail.com";
			}
			if("merry" == email)
			{
				return "merry@gmail.com";
			}
		}
		else
		{
			System.err.println("invalid");
		}
		return "yes";
	}
		
}
			
			