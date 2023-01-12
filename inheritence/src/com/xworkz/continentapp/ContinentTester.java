package com.xworkz.continentapp;

import java.awt.Component;

import com.xworkz.continentapp.continent.Continent;
import com.xworkz.continentapp.continent.europe.Europe;

public class ContinentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Continent con= new Continent();
		con.continentName("Asia");
		con.types(7);
		
        Europe eu= new Europe();
        eu.continentName("Europe");
        eu.types(7);
        
	}

}
