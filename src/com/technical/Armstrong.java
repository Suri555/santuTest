package com.technical;

import java.util.Scanner;

public class Armstrong {

	private static boolean isAmstrong(int number) {
		int result = 0;
		int orig = number;
		
		while(number > 0) {
			int remainder = number%10;
			result = result+ remainder*remainder*remainder;
			number = number/10;
		}
		if(orig==result) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println("Enter 3 digit no to find amstrong no");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		if(isAmstrong(number)) {
			System.out.println("Number " +number+ " is amstrong no");
		}
		else {
			System.out.println("Number " +number+ " is Not an amstrong no");
		}
	}

}
