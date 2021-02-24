package com.test;

public class DuplicateElements {

	public static void main(String[] args) {
		
		int array[] = {2,4,5,2,3,6,2,4};	
		
		for(int i=0; i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					System.out.println(array[j]);
					
				}
			}
		}
		
	}

}
