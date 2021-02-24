package com.exception;

public class ArrayIndex {
	static void validate() {
		try {
			int arr[] = new int[5];
			arr[10]=20;
		}
		
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		validate();
		System.out.println("Rest of code");
	}
}
