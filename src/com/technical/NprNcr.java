package com.technical;

import java.util.Scanner;

public class NprNcr {
	
	
	public static int factorial(int n) {
		int fact = 1;
		
		for(int i=1; i<=n;i++) {
			fact = fact*i;
		}
		return fact;
		
	}

	public static void main(String[] args) {

		int n, r;
		Scanner scan = new Scanner(System.in);
		System.out.println("T calculate nCr and nPr we need n and r value");
		System.out.println("enter the value for n \n");
		n=scan.nextInt();
		
		System.out.println("Enter the value for r\n");
		r= scan.nextInt();
		
		int ncr = (factorial(n)/(factorial(n-r)*factorial(r)));
		
		int npr = (factorial(n)/factorial(n-r));
		
		System.out.println(ncr);
		System.out.println(npr);
	}

}
