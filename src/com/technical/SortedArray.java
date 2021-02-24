package com.technical;

import java.util.Arrays;

public class SortedArray {

	public static void reverseArray(int a[]) {
		int temp;
		int start = 0;
		int last = a.length-1;
		
		while(start<last) {
			temp = a[start];
			a[start] = a[last];
			a[last] = temp;
			
			start++;
			last--;
			
		}
		
	}
	
	public static void printArray(int a[],int size) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+ " ");
		}
	}
	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,6};
		reverseArray(a);
		printArray(a,a.length);
		Arrays.sort(a);
		System.out.println();
		for(int aa: a) {
		System.out.println(aa);
		}
	}

}
