class Helmet{
	static String name;
	static float price;
	String color;
	String material;
	
	Helmet(String name,float price,String color,String material)
	{
		this.name=name;
		this.price=price;
		this.color=color;
		this.material=material;
	}
	static{
		name="Vega";
		price=1599f;
	}
	static void topStatic()
	{
		System.out.println("invoking Top Static in Helmet");
		System.out.println("Brand name :"+name);
		System.out.println("Price :"+price);
	}
	void topInstance()
	{
		System.out.println("invoking Top Instance in Helmet");
		System.out.println("Color :"+color);
		System.out.println("material :"+material);
	}
}