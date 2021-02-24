package com.technical;

public class PrimeNumbers {
	
	static void checkPrime(int n) {
		int m=0;
		boolean prime = false;
		m=n/2;
		if(n==0 || n==1) {
			System.out.println(n+ " is not Prime number");
		}
		for(int i=2;i<=m;i++) {
			if(n%i == 0) {
				//System.out.println(n+ " is not a prime number");
				prime = true;
				break;
			}
			
		}
		if(prime) {
			System.out.println(n+ " is not Prime number");
		}
		else {
			System.out.println(n+ " is  a prime number");
		}
	}

	public static void main(String[] args) {
		checkPrime(15);
	}

}
