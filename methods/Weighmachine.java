class Weighmachine{
	
	static void tool(String name,String type,float price)
	{
		System.out.println("String name:"+"Scales and Balances");
		System.out.println("String type:"+"Digital");
		System.out.println("String bakeryName:"+13409);
		
	
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
	if (price != 14000) 
	{
        System.out.println(" price is valid");
    } 
    else 
	{
        System.err.println("price is invalid");
    }
	
    }

    

    public static void main(String[] args)
	{
        System.out.println("Cake information");
        Weighmachine.tool("Scales and Balances","Digital",13409);
    }
}