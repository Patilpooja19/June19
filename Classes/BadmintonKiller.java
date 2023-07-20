class BadmintonKiller{
	public static void main(String []args)
	{
	System.out.println(" invoking main in BadmintonKiller");
	
	    Badminton badminton= new Badminton();
		System.out.println(badminton.userNuserNname); //null
	    System.out.println(badminton.noOfPlayers); //null
		System.out.println(badminton.color); //null
	    System.out.println(badminton.duration ); //0
	    System.out.println(badminton.brand); //null
		
		
	    System.out.println(" ===================="); //null
		badminton.userNname="Pooja";
     	badminton.noOfPlayers=2;
        badminton.color = "Black";
		badminton.duration=28;
	    badminton.brand = "YonexZR100";
		
		System.out.println(badminton.userNname); //null
	    System.out.println(badminton.noOfPlayers); //0
	    System.out.println(badminton.color); //null
	    System.out.println(badminton.duration ); //0
	    System.out.println( badminton.brand); //null
		
        Badminton badminton1 = new Badminton();
		System.out.println(badminton1.userNname); //null
	    System.out.println(badminton1.noOfPlayers); //0
        System.out.println(badminton1.color); //null
	    System.out.println(badminton1.duration ); //0
	    System.out.println(badminton1.brand); //null
		
		badminton1.userNname="Sachin";
     	badminton1.noOfPlayers=2;
		badminton1.color = "Red";
		badminton1.duration=30;
	    badminton1.brand = "Li-Ning WingLite700";
		
		System.out.println(badminton1.userNname); //null
	    System.out.println(badminton1.noOfPlayers); //0		
		System.out.println( badminton1.color); //null
	    System.out.println(badminton1.duration ); //0
	    System.out.println(badminton1.brand); //null
		
	}
}