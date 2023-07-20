class Metro{
	String name;
	 int noOfPassengers;
	 String color;
     String place;
	String capacity;
    
	public static void main(String []args)
	{
	System.out.println(" invoking main in Metro");
	
	    Metro metro= new Metro();
		System.out.println(metro.name); //null
	    System.out.println(metro.noOfPassengers); //null
		System.out.println(metro.color); //null
	    System.out.println(metro.place ); //0
	    System.out.println(metro.capacity); //null
		
		
	    System.out.println(" ===================="); //null
		metro.name="PurpleLineMetro";
     	metro.noOfPassengers=200;
        metro.color = "Purple";
		metro.place="Hubli";
	    metro.capacity = "high";
		
		System.out.println(metro.name); //null
	    System.out.println(metro.noOfPassengers); //0
	    System.out.println(metro.color); //null
	    System.out.println(metro.place ); //0
	    System.out.println( metro.capacity); //null
		
        Metro metro1 = new Metro();
		System.out.println(metro1.name); //null
	    System.out.println(metro1.noOfPassengers); //0
        System.out.println(metro1.color); //null
	    System.out.println(metro1.place ); //0
	    System.out.println(metro1.capacity); //null
		
		metro.name="NammaMetro";
     	metro.noOfPassengers=250;
		metro1.color = "Blue";
		metro1.place="Dharwad";
	    metro1.capacity = "medium";
		
		System.out.println(metro1.name); //null
	    System.out.println(metro1.noOfPassengers); //0		
		System.out.println( metro1.color); //null
	    System.out.println(metro1.place ); //0
	    System.out.println(metro1.capacity); //null
		
	}
}