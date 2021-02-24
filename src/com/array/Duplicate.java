package com.array;

import java.util.Arrays;

public class Duplicate {

	public static void main(String[] args) {

		int arr[]= {5,2,10,7,2,7};
		int sum=0;
		
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[j]=arr[i]+1;
						}
			 }
			
			System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
		
				for(int i =0;i<arr.length;i++) {
					sum = sum+arr[i];
				}
				System.out.println(sum);
	}

}
