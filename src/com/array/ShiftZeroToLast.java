package com.array;

import java.util.Arrays;

public class ShiftZeroToLast {

	public static void main(String[] args) {
		
		int array[] = {2,14,5,0,4,0,6,3,0};
		
		int counter = 0;
		
		for(int i=0;i<array.length;i++) {
				if(array[i]!=0) {
					array[counter]=array[i];
					counter++;
				}
		}
		
		while(counter<array.length) {
			array[counter]=0;
			counter++;
		}
		
		System.out.println(Arrays.toString(array));
	}

}
