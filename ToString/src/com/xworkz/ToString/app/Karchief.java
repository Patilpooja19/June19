package com.xworkz.ToString.app;

public class Karchief {
	
		private String brand;
		private float price;
		private String type;
		private char size;
		private String color;
		private int manufactureDate;
		private String shape;
		
		public Karchief() {
			
		}
		
		public Karchief (String brand, float price, String type, char size, String color, int manufactureDate, String shape)
		{
			super();
			this.brand=brand;
			this.price=price;
			this.type=type;
			this.size=size;
			this.color=color;
			this.manufactureDate=manufactureDate;
			this.shape=shape;
		}
		
		@Override
		public String toString()
		{
			return "Brand :"+brand+"Price :"+price+ "Type :"+type+ "Size :"+size+ "Color :"+ color+ "Manufacture Date :"+ manufactureDate+ "Shape :"+shape;
		}

}
