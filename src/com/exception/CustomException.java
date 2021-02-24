package com.exception;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception{
	InvalidAgeException(String s){
		super(s);
	}
}

public class CustomException {
	
	 static void  validate(int age) throws InvalidAgeException{
		if(age<18)
			throw new InvalidAgeException("Invalid age");
		else 
		{
			System.out.println("welcome for voting");
		}
	 }
	public static void main(String[] args) {
		
	try {
		CustomException.validate(12);
	}
	catch(Exception e) {
		System.out.println("Exception occured" + e);
	}
	
	System.out.println("Rest of code");
	}
}
