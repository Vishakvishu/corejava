package com.xworkz.vegitableapp.vegitable;

public class Vegitables {
	
	public String name;
	public int cost;
	
	public String name(String name) {
		this.name=this.name+name;
		System.out.println("vegitables name : "+ name);
		return name;
	}
	public int cost(int cost) {
		this.cost=this.cost+cost;
		System.out.println("vegitable cost is : "+ cost);
		return cost;
	}

}
