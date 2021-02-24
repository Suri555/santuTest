package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Gmailvalidation {
	
	public static boolean gmailValid(String g) {
		Pattern pattern = Pattern.compile("^[A-Za-z0-9._%-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,6}$"/*, Pattern.CASE_INSENSITIVE*/);
		Matcher matcher = pattern.matcher(g);
		return matcher.find();
		
	}

	public static void main(String[] args) {

		System.out.println(gmailValid("santu@gmail.com"));
	}

}
