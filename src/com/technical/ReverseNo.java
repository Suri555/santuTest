package com.technical;

public class ReverseNo {

		
	public static void main(String[] args) {
		int n=121;
		int rev=0;
		int m =n;
		int rem=0;
		while(n>0) {
			 rem = n%10;
			System.out.println(rem);
			 rev = rev*10+rem;
			n=n/10;
		}
		if(m==rev) {
			System.out.println("The given no " +m+ " is polindrome");
		}
		else {
			System.out.println("The given no " +m+ " is not polindrome");
		}
		System.out.println(rev);
		}

	

}
