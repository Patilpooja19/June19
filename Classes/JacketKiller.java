class JacketKiller{
	public static void main(String []args)
	{
	System.out.println(" invoking main in jacketKiller");
	
	   Jacket jacket = new Jacket();
	  	System.out.println(jacket.color); //null
	    System.out.println(jacket.size ); //0
	    System.out.println(jacket.brand); //null
		
		
	    System.out.println("------"); //null
		
		jacket.color = "pink";
		jacket.size=36;
	    jacket.brand = "peter";
		
	    System.out.println(jacket.color); //null
	    System.out.println(jacket.size ); //0
	    System.out.println( jacket.brand); //null
		
		System.out.println("==============="); //null

	   Jacket jacket1 = new Jacket();
        System.out.println(jacket1.color); //null
	    System.out.println(jacket1.size ); //0
	    System.out.println(jacket1.brand); //null
		
		System.out.println("------"); //null
		
		jacket1.color = "black";
		jacket1.size=34;
	    jacket1.brand = "zudio";
		
		System.out.println( jacket1.color); //null
	    System.out.println(jacket1.size ); //0
	    System.out.println(jacket1.brand); //null
		
	}
}