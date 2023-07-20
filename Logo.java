class Logo{
	
	String means; //symbol
	int year; //1937
	String color;
	String types;
	int rangeInPixels;//250 to 400
	String uses;
	String invented;//1300AD
	String inventor;//Ancient Egyptians
	String fullForm;//language of graphics-oriented
	int size;
	
	Logo()
	{
		System.out.println("invoking with no arg");
		System.out.println(means);
		System.out.println("means :"+means);
	}
	
	Logo(String means)
	{
		System.out.println("invoking with parameters");
		System.out.println("means :"+means);
		this.means=means;
	}
	
	Logo(int year,String color)
	{
		System.out.println("invoking with parameters");
		System.out.println("year :"+year);
		System.out.println("color :"+color);
		this.year=year;
		this.color=color;
	}
	
	Logo(String types,int rangeInPixels)
	{
		System.out.println("invoking with parameters");
		System.out.println("types :"+types);
		System.out.println("rangeInMeter :"+rangeInPixels);
		this.types=types;
		this.rangeInPixels=rangeInPixels;
	}
	
	Logo(String uses,String invented)
	{
		System.out.println("invoking with parameters");
		System.out.println("uses :"+uses);
		System.out.println("invented :"+invented);
		this.uses=uses;
		this.invented=invented;
	}
	
	Logo(String color,int size,String fullForm)
	{
		System.out.println("invoking with parameters");
		System.out.println("color :"+color);
		System.out.println("size :"+size);
		System.out.println("fullForm :"+fullForm);
		this.color=color;
		this.size=size;
		this.fullForm=fullForm;
		
	}
	
	Logo(int rangeInPixels,int year )
	{
		System.out.println("invoking with parameters");
		System.out.println("rangeInPixels :"+rangeInPixels);
		System.out.println("year :"+year);
		this.rangeInPixels=rangeInPixels;
		this.year=year;
	}
	
	Logo(int rangeInPixels,String uses,int year)
	{
		System.out.println("invoking with parameters");
		System.out.println("rangeInPixels :"+rangeInPixels);
		System.out.println("uses :"+uses);
		System.out.println("year :"+year);
		this.rangeInPixels=rangeInPixels;
		this.uses=uses;
		this.year=year;
	}
	
	Logo(int size,String uses,String types)
	{
		System.out.println("invoking with parameters");
		System.out.println("size :"+size);
		System.out.println("uses :"+uses);
		System.out.println("types :"+types);
		this.size=size;
		this.uses=uses;
		this.types=types;
	}
		
		
}
		