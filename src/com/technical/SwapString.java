package com.technical;

public class SwapString {

	public static void main(String[] args) {

		String a = "Santhu";
		String b = "Kumar";
		
		System.out.println("Before swap \n a = " +a+ "\n b = "+b);
		
		a = a+b;
		b = a.substring(0,(a.length()-b.length()));
		a = a.substring(b.length());
		
		System.out.println("After swapping \n a = " +a+ "\n b = "+b);
	}

}
