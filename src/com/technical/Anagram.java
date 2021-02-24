package com.technical;

import java.util.Arrays;

public class Anagram {
	
	static void anagrams(String str1, String str2) {
	String s1 =	str1.replaceAll("\\s","");
	String s2 = str2.replaceAll("\\s", "");
	
	boolean status=true;
	
	if(s1.length()!=s2.length()) {
		status=false;
	}
	else {
		char ch1[] = s1.toLowerCase().toCharArray();
		char ch2[] = s2.toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		status = Arrays.equals(ch1, ch2);
	}
	
	if(status) {
		System.out.println(s1+ " "+s2 + " are anagram");
	}
	else {
		System.out.println(s1+ " "+s2 + " are not anagram");
	}
	}

	public static void main(String[] args) {
	
		anagrams("Mother in law","Hitler woman");
	}

}
