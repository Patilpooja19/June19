class FabricKiller{

		public static void main(String[] args)
		{
			System.out.println("running in FabricKiller");
			
			double ref=Fabric.getPrice("cotton");
			System.out.println("Ref is :"+ ref);
			
			double ref1=Fabric.getPrice("nylon");
			System.out.println("Ref is :"+ ref1);
			
			double ref2=Fabric.getPrice("woolen");
			System.out.println("Ref is :"+ ref2);
			
			double ref3=Fabric.getPrice("linen");
			System.out.println("Ref is :"+ ref3);
			
			double ref4=Fabric.getPrice("polyster");
			System.out.println("Ref is :"+ ref4);
			
			double ref5=Fabric.getPrice("silk");
			System.out.println("Ref is :"+ ref5);
			
			
			
			Fabric.getPrice("type");
		}
}