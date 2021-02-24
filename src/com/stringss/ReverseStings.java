 package com.stringss;

public class ReverseStings {

	public static String reverse(String str) {
		
		char ch[] = str.toCharArray();
		String rev="";
		
		for(int i=ch.length-1;i>=0;i--) {
			rev = rev+ch[i];
		}
		return rev;
	}
	
	public static void main(String args[]) {
		
		System.out.println(reverse("hello"));
	}

}
