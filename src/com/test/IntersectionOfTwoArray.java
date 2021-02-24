package com.test;

import java.util.HashSet;

public class IntersectionOfTwoArray {

	public static void main(String[] args) {
		int firstArray[] = {12,6,27,24};
		int secondArray[] = {12,24,26,27};
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<firstArray.length;i++) {
			for(int j=0;j<secondArray.length;j++) {
						if(firstArray[i]==secondArray[j]) {
							System.out.println(secondArray[j]);
							//hs.add(secondArray[j]);
						}
			}
		}
		
		//System.out.println(hs);
	}
	

}
