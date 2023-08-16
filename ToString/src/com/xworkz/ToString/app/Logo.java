package com.xworkz.ToString.app;

public class Logo {
		
	private String Name;
	private String logoType;
	private boolean LogoMaker;
	private int founded;
	private String Organization;
	
	public Logo() {
	}
	
	public Logo(String Name,String logoType,boolean LogoMaker,int founded,String Organization)
	{
		super();
		this.Name=Name;
		this.logoType=logoType;
		this.LogoMaker=LogoMaker;
		this.founded=founded;
		this.Organization=Organization;
	}
	
	@Override
	public String toString() {
		return "Logo Maker :"+Name+ "Logo Type :"+logoType+"Free Logo Maker :"+LogoMaker+"Founded :"+founded+" Organization :"+Organization;
	}

}
