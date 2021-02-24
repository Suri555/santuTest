package com.technical;

import java.util.Scanner;

public class Fibonacci {

	public static int finonacci(int n) {
		
		if(n==1 ||n==2) {
			return 1;
		}
	
		int fib1=1,fib2=1,fibonacci=1;
		
		for(int i=3;i<=n;i++) {
			fibonacci = fib1+fib2;
			fib1 = fib2;
			fib2=fibonacci;
		}
		return fibonacci;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter value to find fibonacci");
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println(finonacci(12));
		
	}

}
