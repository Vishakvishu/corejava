package com.xworkz.fruitapp;

import com.xworkz.fruitapp.fruit.Fruit;
import com.xworkz.fruitapp.fruit.apple.Apple;

public class FruitTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fruit fru= new Fruit();
		fru.fruitName("Mango");
		fru.type("Sweat");
		fru.price(100);
		
		Apple app = new Apple();
		app.fruitName("Apple");
		app.type("sweat");
		app.price(150);
		

	}

}
