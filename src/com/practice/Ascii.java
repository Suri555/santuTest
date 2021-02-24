package com.practice;

public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*char c = 'a';
		int n=0;
		n=(int)c;
		n=n+1;
		c=(char)n;
		
		System.out.println("Ascii of c is "+n);
		System.out.println(c);
				*/
		
		String str = "abk";
		char[] c = str.toCharArray();
		//str=String.valueOf(c);
		System.out.println(str);
		
		for(int i=0;i<c.length;i++) {
			int n = (int)c[i];
			if(n==122) { 
				n=97;
			}
			
			else {
			n=n+1;
			}
			
			c[i]=(char)n;
		}
			str= String.valueOf(c);
		System.out.println(str);
		}
}
