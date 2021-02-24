package com.stringss;

public class AbhiString {

	public static String addString(String s1, String s2) {
		String s3 = s1;
		StringBuffer sb = new StringBuffer(s1);
		char ch[]=s2.toCharArray();
		for(char c:ch) {
			if(s3.indexOf(c)<0) {
				sb.append(c);
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {

		String s1="java";
		String s2="javatpoint";
		System.out.println(addString(s1,s2));
	}

}
