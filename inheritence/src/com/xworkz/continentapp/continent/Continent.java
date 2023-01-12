package com.xworkz.continentapp.continent;

public class Continent {
	
	public String continentName;
	public int types;
	
	public String continentName(String continentName) {
		this.continentName=this.continentName+continentName;
		System.out.println("continent name is : "+ continentName);
		return continentName;
	}
	
	public int types(int types) {
		this.types=this.types+types;
		System.out.println("continent type is : "+ types);
		return types;
		
	}

}
