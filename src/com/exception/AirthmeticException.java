 package com.exception;

public class AirthmeticException {
	static int  validate() {
		try {
			int x=50/0;
			return x;
		}
		
		
		catch(NullPointerException e) {
			System.out.println(e);
		}
		
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(validate());
		System.out.println("Rest of code");
		
	}
}