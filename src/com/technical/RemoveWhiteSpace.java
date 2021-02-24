package com.technical;

public class RemoveWhiteSpace {

	public static String removeSpace(String str) {
		
		char ch[] = str.toCharArray();
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<ch.length;i++) {
			if((ch[i]!=' ') && (ch[i]!='\t'))
			{
				sb.append(ch[i]);
			}
		}
		
		return sb.toString();
	}
	public static void main(String args[]) {
		System.out.println(removeSpace("This is a Pen"));
		
	}
}
