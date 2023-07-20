class Scanner{
	
	static void device(String name,String type,String quality)
	{
		System.out.println("String name:"+"hp");
		System.out.println("String type:"+"handheld");
		System.out.println("String quality:"+"300 dpi");
		
	
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
	if (quality != null) 
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
        Scanner.device("hp","handheld","300 dpi");
    }
}