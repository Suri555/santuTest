package com.test;

public class LargestArray {

	public static void main(String[] args) {
		
		 int  array[] = {12,14,25,12,125};
		 
		 int large= array[0];
		 for(int i=1;i<array.length;i++) {
			 if(array[i]>large) {
				 
				 large=array[i];
				
			 }
		 }
		 System.out.println(large);
		
	}

}
