class BureauKiller{
	public static void main(String[] args){
		System.out.println("Running main in BureauRunner");
		
		Bureau bureau=new Bureau(4000,true);
		Bureau.staticBureau();
		bureau.instanceBureau();
		
		System.out.println("---------");
		
		Bureau bureau1=new Bureau(5000,false);
		Bureau.staticBureau();
		bureau1.instanceBureau();
		
	}
}