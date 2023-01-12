package com.xworkz.vegitableapp;

import com.xworkz.vegitableapp.vegitable.Vegitables;
import com.xworkz.vegitableapp.vegitable.potato.Potato;

public class VegitableTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vegitables veg = new Vegitables();
		veg.name("Onion");
		veg.cost(35);
		
		Potato po = new Potato();
		po.name("Potato");
		po.cost(20);

	}

}
