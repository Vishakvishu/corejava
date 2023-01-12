package com.xworkz.searchEngineapp.searchEngine;

public class SearchEngine {
		
		public String name;
		public String information;
		
		
		
		public String toSearch (String information) {
			
			this.information=information;
			System.out.println("Site Name : "+information);
			return information;
				
		}
		
		public String websiteName(String name) {
			this.name=name;
			System.out.println("Web Name : "+name);
			return name;
			
		}
		
		
	}


