package com.xworkz.colorapp.color;

public class Color {

	public String name;
	public String color;
	
	public  String name(String name) {
		 this.name = this.name+name;
		 System.out.println("color name is : "+ name);
		 return name;
	 }
	
	public  String color(String color) {
		 this.color = this.color+color;
		 System.out.println("color name is : "+ color);
		 return color;
	 }
}
