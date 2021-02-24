package com.test;

public class Duplicatestringss {

	public static void main(String args[]) {
		String[] array = {"java","Python","java","C","C"};
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i].equals(array[j])) {
					System.out.println(array[j]);
				}
			}
		}
	}
}
