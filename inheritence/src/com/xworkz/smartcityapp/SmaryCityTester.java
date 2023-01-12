package com.xworkz.smartcityapp;


import com.xworkz.smartcityapp.smartcity.SmartCity;
import com.xworkz.smartcityapp.smartcity.banglore.Banglore;

public class SmaryCityTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartCity smr = new SmartCity();
		smr.smartcityplace("Shivamogga");
		smr.pincode(453456);
		smr.type("clean city");
		
		Banglore ban = new Banglore();
		ban.smartcityplace("Banglore");
		ban.pincode(988766);
		ban.type("smart city");
	

	}

}
