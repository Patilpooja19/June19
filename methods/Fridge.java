class Fridge{
	
	static void store(String item1,String item2,String item3,String item4,String item5,String item6,String item7,String item8,String item9,String item10)
	{
		System.out.println("String item1:"+"ketchup");
		System.out.println("String item2:"+"dairy products");
		System.out.println("String item3:"+"leaf vegetable");
		System.out.println("String item4:"+"cream cheese");
		System.out.println("String item5:"+"sauce");
		System.out.println("String item6:"+"Strawberry");
		System.out.println("String item7:"+"cereals");
		System.out.println("String item8:"+"Grains");
		System.out.println("String item9:"+"Snacks");
		System.out.println("String item10:"+"Spices");
	
    if (item1 != null) 
	{
        System.out.println("ketchup is valid");
    } 
    else 
	{
            System.err.println("ketchup is invalid");
    }
	if (item2 != null) 
	{
        System.out.println("dairy products is valid");
    } 
    else 
	{
            System.err.println("dairy products is invalid");
    }
	if (item3 != null) 
	{
        System.out.println("leaf vegetable is valid");
    } 
    else 
	{
        System.err.println("leaf vegetable is invalid");
    }
	if (item4 != null) 
	{
        System.out.println("cream cheese is valid");
    } 
    else 
	{
            System.err.println("cream cheese is invalid");
    }
	if (item5 != null) 
	{
        System.out.println("sauce is valid");
    } 
    else 
	{
            System.err.println("sauce is invalid");
    }
	if (item6 != null) 
	{
        System.out.println("Strawberry is valid");
    } 
    else 
	{
            System.err.println("Strawberry is invalid");
    }
	if (item7 != null) 
	{
        System.out.println("cereals is valid");
    } 
    else 
	{
            System.err.println("cereals is invalid");
    }
	if (item8 != null) 
	{
        System.out.println("Grains is valid");
    } 
    else 
	{
            System.err.println("Grains is invalid");
    }
	if (item9 != null) 
	{
        System.out.println("Snacks is valid");
    } 
    else 
	{
            System.err.println("Snacks is invalid");
    }
	if (item10 != null) 
	{
        System.out.println("Spices is valid");
    } 
    else 
	{
            System.err.println("Spices is invalid");
    }
    }

    

    public static void main(String[] args)
	{
        System.out.println("Cake information");
        Fridge.store("ketchup","dairy products ","leaf vegetable","cream cheese","sauce","Strawberry","cereals","Grains","Snacks","Spices");
    }
}

		