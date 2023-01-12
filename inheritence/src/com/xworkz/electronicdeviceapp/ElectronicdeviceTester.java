package com.xworkz.electronicdeviceapp;

import com.xworkz.electronicdeviceapp.electronicdevice.Electronicdevice;
import com.xworkz.electronicdeviceapp.electronicdevice.Hp.Hp;

public class ElectronicdeviceTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Electronicdevice elec = new Electronicdevice();
		elec.electronicdeviceName("Asus");
		elec.type("Laptop");
		elec.cost(45000);
		
		Hp hp = new Hp();
		hp.electronicdeviceName("HP");
		hp.type("Laptop");
		hp.cost(50000);

	}

}
