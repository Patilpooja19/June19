class Biscuit{
	
	public static void main(String[] args)
	{
		System.out.println("Biscuit Information");
		
		String sunfeast="Sunfeast";
		String parleG="ParleG";
		String unibic="Unibic";
		String mariegold="Mariegold";
		String oreo="Oreo";
		String blackjack="Blackjack";
		String darkfantasy="Darkfantasy";
		
		String[] biscuits={"Sunfeast","Unibic","ParleG","Oreo","Mariegold","Blackjack","Darkfantasy"};
		
		//String ref=biscuits[0];
        //System.out.println("elements at index 0 :"+ref);
	   biscuits[2]="magic";
		
		for(int pos=0;pos<=6;pos++)
		{
			System.out.println("the biscuit :"+pos+  "is"+ biscuits[pos]);
		}
		System.out.println("-------");
		
		biscuits[5]="50-50";
		
		for(int pos=6;pos>=0;pos--)
		{
			System.out.println("the biscuit :"+pos+ "is" + biscuits[pos]);
		}
		
		
	}
}