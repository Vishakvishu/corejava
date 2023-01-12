package com.xworkz.companyapp.company;

public class Company {
	public String name;
	public String place;
	
	 public  String name(String name) {
		 this.name = this.name+name;
		 System.out.println("Company name is : "+ name);
		 return name;
	 }
	 public String place(String place) {
		 this.place=this.place+place;
		 System.out.println("company place is : "+ place  );
		 return place;
		 
	 }

}
