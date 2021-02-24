package com.technical;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {

		int a[] = {1,3,10,5,7};
		
		int b[] = {2,4,6,8};
		
		int i,j,k;
		
		int c[] = new int[a.length+b.length];
		/*int c[] = new int[a.length+b.length];
		int k=0;
		int j=0;
		
		for(int i=0;i<c.length;i++) {

			if(j<a.length && k<b.length) {
				if(b[k] < a[j]) {
					c[i] = b[k];
					k++;
				}
				else {
					c[i] = a[j];
					j++;
				}
			}
			else if(k<b.length) {
				c[i] = b[k];
				k++;
			}
			else {
				c[i] = a[j];
				j++;
			}
			
		}

		for(int i=0;i<c.length;i++) {
		System.out.println(c[i]);
		}*/
		
		for(i=0;i<a.length;i++) {
			c[i] = a[i];
		}
		for(j=0, k=a.length; k < c.length && j<b.length; j++ , k++) {
			c[k] = b[j];
			
		}
		
		Arrays.sort(c);
		
		for(int it: c) {
			System.out.println(it);
		}
	/*	for(i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
*/	}

}
