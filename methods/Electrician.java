class Electrician{
	
	static void repair()
	{
		System.out.println("He will do repair");
	}
	static void person(){
		System.out.println("Electrician is also a person");
	}
	static void electricianBill(float price)
	{
		System.out.println("name of the Electrician :"+price);
	}
	static void electrician(String name, int income){
		System.out.println("Name of the Electrician: " + name);
		System.out.println("Income: " + income);
	}
	
	static void electrician(int experience, String name){
		System.out.println("Name of the Electrician: " + name);
		System.out.println("experience: " + experience);
	}
	static void electricianWork(){
		System.out.println("electrician  repairs the things");
	}
	
	static void electricianSupervise(){
		System.out.println("Electrician will guide their trainee to complete the work");
	}
	
	static void payAmount(int salary){
		System.out.println("Paying salary to workers: " + salary);
	}
	
	static void plan(){
		System.out.println("PLan for work to complete");
	}
	
	static void bid(){
		System.out.println("bid to get electrician");
	}
}