package com.xworkz.smartcityapp.smartcity;

public class SmartCity {
	
	
	public String place;
	public int pincode;
	public String type;
	
	public String smartcityplace(String place) {
		this.place=this.place+place;
		System.out.println("smartcity place is : "+ place);
		return place;
	}
	public int pincode(int pincode) {
		this.pincode=this.pincode+pincode;
		System.out.println("smartcity pincode is : "+ pincode);
		return pincode;
	}
	public String type(String type) {
		this.type=this.type+type;
		System.out.println("smartcity type is : "+ type);
		return type;

}
}
