package com.xworkz.ToString.boot;

import com.xworkz.ToString.app.*;;

public class Runner {

	public static void main(String[] args) {
		
		System.out.println("====LOGO====");
		
		Logo logo=new Logo("Logo Maker","Product Logo",true,2004,"Canva");
		System.out.println(logo);
		
		Logo logo2=new Logo("Wix","Ad Logo",false,2014,"Tv");
		System.out.println(logo2);
		
		Logo logo3=new Logo("Mecablada","School Logo",true,2019,"Microsoft");
		System.out.println(logo3);
		System.out.println("\n");
		
		System.out.println("====KARCHIEF====");
		
		Karchief hand = new Karchief();
		System.out.println(hand);
		Karchief hand1 = new Karchief("Max", 150, "Cotton", 'S', "Cream", 1980, "Square");
		System.out.println(hand1);
		Karchief hand2 = new Karchief("Canva Mart", 300, "naylon", 'L', "Blue", 2010, "Rectangle");
		System.out.println(hand2);
		
		System.out.println("====CAVE====");
		
		Cave cave = new Cave();
		System.out.println(cave);
		Cave cave1 = new Cave("Western-Ghats", "Yana caves", "Sunlight", "arched", "black", 19, "wind sound", true, false, "flowStone");
		System.out.println(cave1);
		Cave cave2 = new Cave("Badmi", "Badmi caves", "Natural", "Rectangular", "Brown", 20, "Stream Sound", false, true, "Sand Stone");
		System.out.println(cave2);
		
		System.out.println("====PENDANT====");
		
		Pendant pendant = new Pendant();
		System.out.println(pendant);
		Pendant pendant1 = new Pendant("Cork", "Size", "Graphical", "Bail", "diamond", "Gems", "Gold Box", "Symbolic", "Prong", "pink", "Offences", "Size");
		System.out.println(pendant1);
		Pendant pendant2 = new Pendant("Yellow Steel", "Shape", "Geometry", "Bail", "Silver", "metals", "Curb Link", "Magical", "prong", "White", "bail", "pieces");
		System.out.println(pendant2);
		
		
		
		
		

	}

}
