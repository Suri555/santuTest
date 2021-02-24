package com.stringss;

public class SubString {

	public static void main(String[] args) {
		String str = "Santhu";
		String str2 = "Suni";
		System.out.println(str.substring(2));
		System.out.println(str.substring(1, 3));
		System.out.println(str.replace("a", "v"));
		str2 = str.concat(str2);
		System.out.println(str2);
	}

}