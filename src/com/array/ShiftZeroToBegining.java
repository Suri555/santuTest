package com.array;

import java.util.Arrays;

public class ShiftZeroToBegining { 

	public static void main(String[] args) {

		int array[] = {1,5,0,23,45,0,6,7,0,7};
		int counter = array.length-1;
		
		for(int i=array.length-1;i>=0;i--) {
			if(array[i]!=0) {
				array[counter]=array[i];
				counter--;
			}
		}
		
		while(counter>=0) {
			array[counter]=0;
			counter--;
		}
		
		System.out.println(Arrays.toString(array));
	}
	
	

}
