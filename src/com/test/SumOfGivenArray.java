package com.test;

public class SumOfGivenArray {

	public static void main(String[] args) {

		int array[] = {2,4,6,8,3,7,9};
		int n = 10;
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]+array[j]==n) {
					System.out.println("sum of "+array[i]+"+"+array[j]+" = "+n);
				}
			}
		}
	}

}
