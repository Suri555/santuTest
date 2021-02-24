package com.regex;

import java.util.regex.Pattern;

public class PancardValidation {
	
	public static boolean valid(String s) {
		
		String patt = ("[A-Z]{4}[0-9]{5}[A-Z]{1}");
		boolean matcher = Pattern.matches(patt, s);
		System.out.println(matcher);
		return matcher;
	}

	public static void main(String[] args) {
		System.out.println(valid("ABCD12345E"));
		
	}

}
