package com.test;

public class ReverseArray 
{  
	int a=10, b=20,c=30;
	public int m1() {
		
		
		
	
	
	
		try {
			/*int a=20,b=0;
			b=a/0;*/
			return 10;
		}
		catch(Exception e) {
			e.printStackTrace();
			return 20;
		}
      finally {
			return 60;
		}
		
	}
	public static void main(String args[]) {
		ReverseArray ra = new ReverseArray();
		
		System.out.println(ra.m1());
		
		
	
	
  /* public static void main(String args[]) {
	   int n = 121, a=0;
	   int m=n;
	   int remainder;
	  
	   while(n>0) { 
		   remainder = n%10;
		   a = a*10+remainder;
		   n = n/10;
	   }
	   System.out.println(a);
	   
	   if(a==m) {
		   System.out.println("polindrome");
	   }
	   
	   else {
		   System.out.println("Not polindrome");
	   }
   }*/
}
}