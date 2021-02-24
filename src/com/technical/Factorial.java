package com.technical;

public class Factorial {

	public static void main(String[] args) {

		/*int n=4;
		int fact = 1;
		
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println(fact);
		*/
		
		int a[] = {1,2,8,6};
		int b[] = {3,5,9};
		
		int j=0;
		int k=0;
		
		int c[] = new int[a.length+b.length];
		
		for(int i=0;i<c.length;i++) {
			if(j<a.length && k<b.length) {
				
				if(b[k]<a[j]) {
					c[i]=b[k];
					k++;
				}
				else {
					c[i]=a[j];
					j++;
				}
			}
			
			else if(k<b.length) {
				c[i]=b[k];
				k++;
			}
			else {
			c[i]=a[j];
			j++;
			}
		}
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}
		

}
