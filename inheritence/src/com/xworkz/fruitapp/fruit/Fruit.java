package com.xworkz.fruitapp.fruit;

public class Fruit {

	public String name;
	public String type;
	public int cost;
	
	
	public String fruitName(String name) {
		this.name= this.name+name;
		System.out.println("fruit name is : "+ name);
		return name;
	}
	
	public String type(String type) {
		this.type= this.type + type;
		System.out.println("type is : "+ type);
		return type;
		
	}
	
	public int price(int cost) {
		this.cost=this.cost+ cost;
		System.out.println("price is : "+ cost);
		return cost;
	}
	
}
