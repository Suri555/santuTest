package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
	public static boolean valid(String s) {
		
		Pattern pattern = Pattern.compile("(0/91)?[7-9][0-9]{9}");
		Matcher matcher = pattern.matcher(s);
		return matcher.find();
		//return (matcher.find()&& matcher.group().equals(s));
		
		
	}
		/*String str = ("(0/91):?[7-9][0-9]{9}");
		boolean b = Pattern.matches(str, s);
		
		if(b) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Not valid");
		}
		return b;
	}*/
	
	public static void main(String[] args) {
    
		System.out.println(valid("7411660450"));
	}

}
