package com.practice;

public class StrArray {
	public static void main(String args[]) {
		String str = "zbc";
		
		char ch[] = str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			int n = (int)ch[i];
			
			if(n==122) {
				n=97;
			}
			else {
				n=n+1;
			}
			ch[i] = (char)n;
		}
		System.out.println(ch);
		
		
	}

}
