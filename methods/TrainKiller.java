class TrainKiller{

		public static void main(String[] args)
		{
			System.out.println("running in TrainKiller");
			
			String ref=Train.getTrainName(11013);
			System.out.println("Ref is :"+ ref);
			
			String ref1=Train.getTrainName(11014);
			System.out.println("Ref is :"+ ref1);
			
			String ref2=Train.getTrainName(12134);
			System.out.println("Ref is :"+ ref2);
			
			String ref3=Train.getTrainName(22691);
			System.out.println("Ref is :"+ ref3);
			
			
			
			
			Fabric.getPrice("trainNo");
		}
}