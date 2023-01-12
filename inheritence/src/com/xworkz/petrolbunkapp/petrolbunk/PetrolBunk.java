package com.xworkz.petrolbunkapp.petrolbunk;

public class PetrolBunk {
	
	public String name;
	public String type;
	
	public String name(String name) {
		this.name=this.name+name;
		System.out.println("petrolbunk name is : "+ name);
		return name;
	}
	
	public String type(String type) {
		this.type=this.type+type;
		System.out.println(" petrole bunk type  is : "+ type);
		return type;
	}

}
