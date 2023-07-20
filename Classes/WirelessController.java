class WirelessController{
	String brand;
	 String Person;
	 String uses;
     String madeIn;
	int controllingButtons;
    
	public static void main(String []args)
	{
	System.out.println(" invoking main in WirelessController");
	
	    WirelessController wirelessController= new WirelessController();
		System.out.println(wirelessController.brand); //null
	    System.out.println(wirelessController.Person); //null
		System.out.println(wirelessController.uses); //null
	    System.out.println(wirelessController.madeIn ); //0
	    System.out.println(wirelessController.controllingButtons); //null
		
		
	    System.out.println(" ===================="); //null
		wirelessController.brand="AmazonLuna";
     	wirelessController.Person="Pooja";
        wirelessController.uses = "Infrared";
		wirelessController.madeIn="US";
	    wirelessController.controllingButtons = 2;
		
		System.out.println(wirelessController.brand); //null
	    System.out.println(wirelessController.Person); //0
	    System.out.println(wirelessController.uses); //null
	    System.out.println(wirelessController.madeIn ); //0
	    System.out.println( wirelessController.controllingButtons); //null
		
        WirelessController wirelessController1 = new WirelessController();
		System.out.println(wirelessController1.brand); //null
	    System.out.println(wirelessController1.Person); //0
        System.out.println(wirelessController1.uses); //null
	    System.out.println(wirelessController1.madeIn ); //0
	    System.out.println(wirelessController1.controllingButtons); //null
		
		wirelessController.brand="RazerWolverineV2Pro";
     	wirelessController.Person="Sachin";
		wirelessController1.uses = "Bluetooth";
		wirelessController1.madeIn="Austria";
	    wirelessController1.controllingButtons = 4;
		
		System.out.println(wirelessController1.brand); //null
	    System.out.println(wirelessController1.Person); //0		
		System.out.println( wirelessController1.uses); //null
	    System.out.println(wirelessController1.madeIn ); //0
	    System.out.println(wirelessController1.controllingButtons); //null
		
	}
}