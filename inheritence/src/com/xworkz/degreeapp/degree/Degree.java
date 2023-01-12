package com.xworkz.degreeapp.degree;

public class Degree {
	
	public String collagename;
	public String branchName;
	
	public String collageName(String collagename) {
		this.collagename=this.collagename+collagename; 
		System.out.println("brand name is : "+ collagename);
		return collagename;
	}
	
	public  String branchName(String branchName) {
		this.branchName= this.branchName+branchName;
		System.out.println("branch name is : "+ branchName);
		return branchName;
	}

	
		
		
	}


