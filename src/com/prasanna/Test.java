package com.prasanna;

 public class Test {
	 Test(int x){
		 switch(x%2) {
		 case 0:
			 System.out.println("Odd");
			 break;
			 
		 case 1:
			 System.out.println("even");
			 break;
		 }
	 }
	 

	public static void main(String[] args) {

		Test test = new Test(2);
	}

}
