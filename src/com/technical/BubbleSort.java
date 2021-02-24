package com.technical;

public class BubbleSort {
	
	public static void sort(int a[]) {
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i] = a[j];    
					a[j] = temp;
					
				}
			}
		}
	}
	
	public static void display(int a[]) {
		for(int aa: a) {
			System.out.println(aa + " ");
		}
	}

	public static void main(String[] args) {
		int a[] = {3,1,5,8,10,0};
		sort(a);
		display(a);

	}

}
