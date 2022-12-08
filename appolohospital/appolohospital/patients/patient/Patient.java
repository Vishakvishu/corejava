package com.xworkz.appolohospital.appolohospital.patients.patient;

import com.xworkz.appolohospital.constatnt.Gender;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Patient {
	
	private String patientName;
	private String address;
	private Gender gender;
	private int age;
	
	
	public Patient()
	{
	  
	}
	
	
	public Patient(String patientName,String address,Gender gender,int age)
	{
		
		this.patientName =  patientName;
		
		this.address = address;
		this.gender =  gender;
		this.age = age;
		
	}

	
	  public void displayInfo()
	  {
		  
		  System.out.println("Patient name is: " + patientName);
		  System.out.print("Patient Address " +  address);
		  System.out.println(" Patient Gender " +  gender);
		  System.out.println(" Patient age " +  age);
		  
		  
	  }

}


