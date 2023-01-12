package com.xworkz.electronicdeviceapp.electronicdevice;

public class Electronicdevice {
	
	
	public String name;
	public String type;
	public int cost;
   
	
	public String electronicdeviceName(String name) {
		this.name=this.name+name;
		System.out.println("electronicdevice name is : "+ name);
		return name;
	}
	
	public String type(String type) {
		this.type=this.type+type;
		System.out.println("type name is : "+ type);
		return type;
	}
	
	public int cost(int cost) {
		this.cost=this.cost+cost;
		System.out.println("cost is : "+ cost);
		return cost;
	}
   
}
