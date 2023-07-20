class Cake{
	
	static void tasty(String name,String type,String bakeryName,float price,int noOfPieces,String ocassion)
	{
		System.out.println("String name:"+"strawberry");
		System.out.println("String type:"+"normal");
		System.out.println("String bakeryName:"+"ayangar");
		System.out.println("float price:"+500.7f);
		System.out.println("int noOfPieces:"+4);
		System.out.println("ocassion:"+"birthDay");
	
    if (name != null) 
	{
        System.out.println("Cake name is valid");
    } 
    else 
	{
            System.err.println("Cake name is invalid");
    }
	if (type != null) 
	{
        System.out.println("normal cake is valid");
    } 
    else 
	{
            System.err.println("normal Cake is invalid");
    }
	if (bakeryName != null) 
	{
        System.out.println("bakeryName is valid");
    } 
    else 
	{
        System.err.println("bakeryName is invalid");
    }
	if (price != 600) 
	{
        System.out.println("price Cake is valid");
    } 
    else 
	{
            System.err.println("price Cake is invalid");
    }
	if (noOfPieces != 3) 
	{
        System.out.println("noOfPieces is valid");
    } 
    else 
	{
            System.err.println("noOfPieces is invalid");
    }
	if (ocassion != null) 
	{
        System.out.println("birthDay cake  is valid");
    } 
    else 
	{
            System.err.println("birthDay cake is invalid");
    }
    }

    

    public static void main(String[] args)
	{
        System.out.println("Cake information");
        Cake.tasty("strawberry","normal","ayangar",500.7f,4,"birthDay");
    }
}

		