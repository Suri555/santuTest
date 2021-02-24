package com.stringss;

public class GetChar {
	
	public static void main(String args[]) {
	String str = "Java Concept of the day";
	
	char[] ch = new char[10];
	
	str.getChars(5,12,ch,0);
	StringBuffer sb = new StringBuffer();
	for(char c: ch) {
		sb=sb.append(c);
		System.out.println(c);
		
		
	}
	System.out.println(sb);
	}
	

}
