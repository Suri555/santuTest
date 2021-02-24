package com.exception;

public class NullPointer {
	static void nullPointers() {
	try {
		String str = null;
		System.out.println(str.length());
	}
	catch(NullPointerException e) {
		System.out.println(e);
	}
	}
	public static void main(String[] args) {

		nullPointers();
		System.out.println("Rest of code");
	}

}
