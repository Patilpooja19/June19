class Camera{
	
	static void click(String location,int date,int howManyPeople,int resolution,String clarity,String cameraMan)
	{
		System.out.println("String location:"+"banglore");
		System.out.println("int date:"+2023);
		System.out.println("int howManyPeople:"+2);
		System.out.println("int resolution:"+48);
		System.out.println("String clarity:"+"blur");
		System.out.println("String cameraMan:"+"Sachin");
	
    if (location != null) 
	{
        System.out.println("location is valid");
    } 
    else 
	{
            System.err.println("location is invalid");
    }
	if (date != 2023) 
	{
        System.out.println("date is valid");
    } 
    else 
	{
            System.err.println("date is invalid");
    }
	if (howManyPeople != 3) 
	{
        System.out.println("people is valid");
    } 
    else 
	{
        System.err.println("people is invalid");
    }
	if (resolution != 25) 
	{
        System.out.println("resolution is valid");
    } 
    else 
	{
            System.err.println("resolution is invalid");
    }
	if (clarity != null) 
	{
        System.out.println("clarity is valid");
    } 
    else 
	{
            System.err.println("clarity is invalid");
    }
	if (cameraMan != null) 
	{
        System.out.println("cameraMan is valid");
    } 
    else 
	{
            System.err.println("cameraMan is invalid");
    }
    }

    

    public static void main(String[] args)
	{
        System.out.println("Cake information");
        Camera.click("banglore",2023,2,48,"blur","Sachin");
    }
}

		