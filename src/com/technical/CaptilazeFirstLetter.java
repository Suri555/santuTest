package com.technical;

public class CaptilazeFirstLetter {
	
	public static String capitalize(String str) {
		
		String word[] = str.split("\\s");
		String capitalizeString = "";
		
		for(String w: word) {
			String first = w.substring(0,1);
			String afterfirst = w.substring(1);
			
			capitalizeString +=first.toUpperCase()+afterfirst+" ";
		}
		return capitalizeString;
	}
	

	public static void main(String[] args) {
		System.out.println(capitalize("this is a pen"));
	}

}
