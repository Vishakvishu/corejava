package com.xworkz.cricketapp;

public class Cricket {
	
	public String name;
	public int highestscore;
	
	public String name(String name) {
		this.name=this.name+name;
		System.out.println("ciricket player name is : "+ name);
		return name;
	}
	public int  highestscore(int highestscore) {
		this.highestscore= this.highestscore+highestscore;
		System.out.println("cricket highest score is "+ highestscore);
		return highestscore;
	}

}
