class Soda{
	
	static void drink(String name,String type,String flavour)
	{
		System.out.println("String name:"+"sodium carbonate");
		System.out.println("String type:"+"sprite");
		System.out.println("String flavour:"+"artificial");
		
	
    if (name != null) 
	{
        System.out.println("name is valid");
    } 
    else 
	{
            System.err.println("name is invalid");
    }
	if (type != null) 
	{
        System.out.println("type is valid");
    } 
    else 
	{
            System.err.println("type is invalid");
    }
	if (flavour != null) 
	{
        System.out.println("it is valid");
    } 
    else 
	{
        System.err.println("it is invalid");
    }
	
    }

    

    public static void main(String[] args)
	{
        System.out.println("Cake information");
        Soda.drink("sodium carbonate","sprite","artificial");
    }
}