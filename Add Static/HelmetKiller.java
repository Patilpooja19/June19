class HelmetKiller{
	public static void main(String[] args)
	{
		Helmet item=new Helmet("Vega",1599f,"Black","Carbon Fibre");
		Helmet.topStatic();
		System.out.println("\n");
		item.topInstance();
	}
}