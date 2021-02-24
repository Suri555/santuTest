package com.technical;

public class Swap {

	public static void main(String[] args) {

		int a=30;
		int b=20;
		System.out.println("The value of a and b before swapping: a " +a+" b:"+b);
		
		//Swapping without Third variable
		a = a+b;
		
		b = a-b;
		a = a-b;
		
		//Swapping using third variable
		
		/*int Temp=a;
		a=b;
		b=Temp;*/
		
		
		
		System.out.println("The value of a and b after swapping: a " +a+" b:"+b);
		
	}

}
