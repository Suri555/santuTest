package com.test;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToList {
	
	public static void main(String[] args) {
		String[] array = new String[] {"Santhu","Suni","Sudhakar"};
		for(String str: array) {
			System.out.println(str);
		}
		System.out.println("=================");
		ArrayList<String> al = new ArrayList<>(Arrays.asList(array));
		
		for(String st : al) {
			System.out.println(st);
		}
	}

}
