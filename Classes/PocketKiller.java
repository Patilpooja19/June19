class PocketKiller{
	
	public static void main(String[] args)
	{
		System.out.println("Pocket Information");
		
		Pocket pocket=new Pocket();
		System.out.println(pocket.size);
		System.out.println(pocket.color);
		System.out.println(pocket.height);
		System.out.println(pocket.width);
		System.out.println(pocket.brand);
		
		System.out.println("------");
		
		pocket.size=35;
		pocket.color="blue";
		pocket.height="100 cm";
		pocket.width="50 cm";
		pocket.brand="Max";
		
		System.out.println(pocket.size);
		System.out.println(pocket.color);
		System.out.println(pocket.height);
		System.out.println(pocket.width);
		System.out.println(pocket.brand);
		
		System.out.println("===============");
		
		Pocket pocket1=new Pocket();
		System.out.println(pocket1.size);
		System.out.println(pocket1.color);
		System.out.println(pocket1.height);
		System.out.println(pocket1.width);
		System.out.println(pocket1.brand);
		
		System.out.println("------");
		
		pocket1.size=50;
		pocket1.color="red";
		pocket1.height="80 cm";
		pocket1.width="60 cm";
		pocket1.brand="Trends";
		
		System.out.println(pocket1.size);
		System.out.println(pocket1.color);
		System.out.println(pocket1.height);
		System.out.println(pocket1.width);
		System.out.println(pocket1.brand);


		
		
	}
}