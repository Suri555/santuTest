package com.stringss;

public class AddTwoString {
	public static String addString(String s1, String s2) {
		String s3= new String();
		StringBuffer sb = new StringBuffer(s1);
		sb.append(s2);
		
		for(int i=0; i<sb.length();i++) {
			char ch= sb.charAt(i);
			System.out.println("hii");
			
			if(s3.indexOf(ch)<0) {
				s3=s3+ch;
			}
		}
		return s3;
}

	public static void main(String[] args) {

		String s1="java";
		String s2="javatpoint";
		System.out.println(addString(s1,s2));
	}

}
