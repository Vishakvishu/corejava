package com.xworkz.cofeeapp.cofee;

public class Cofeee {	
		public String name;
		public String flavour;
		public double Amount;
		
		
		public String coffeeName(String name) {
			this.name=this.name+name;
			System.out.println("Brand name :"+name);
			return name;
		}
		
		public String flavour(String flavour) {
			this.flavour=this.flavour+flavour;
			System.out.println("Ingridents :"+ flavour);
			return flavour;
		}
		
		public double cost(double Amount) {
			this.Amount=this.Amount+Amount;
			System.out.println("Cost of coffee :"+Amount);
			return Amount;
		}
		
		public void makeA() {
			System.out.println("coffee it feels fresh");
		}
	}


