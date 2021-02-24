package com.test;

import java.util.Arrays;

public class EqualityOfArray {

	public static void main(String[] args) {

		int firstArray[] = {12,24,26,27};
		int secondArray[] = {12,24,27,27};
		
		boolean equalOrNot = Arrays.equals(firstArray, secondArray);
		System.out.println(equalOrNot);
		
		if(equalOrNot) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
	}

}
