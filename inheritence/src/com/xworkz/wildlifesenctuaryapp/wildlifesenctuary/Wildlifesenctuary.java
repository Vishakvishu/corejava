package com.xworkz.wildlifesenctuaryapp.wildlifesenctuary;

public class Wildlifesenctuary {
	
	public String zooName;
	public String place;
	
	public String  zooName(String zooName) {
		this.zooName=zooName+zooName;
		System.out.println("wildlifesenctuary name is : "+ zooName );
		return zooName;
	}
	 public String place(String place) {
		 this.place=this.place+place;
		 System.out.println("wildlifesenctuary place is : "+ place);
		 return place;
	 }

}
