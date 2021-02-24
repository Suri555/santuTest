package com.prasanna;

class Test2{
	public static int x=10;
	
}
 
public class StaticTest3 extends Test2 {
	//public	static int  x=40;
	static int y = 20;
	static {
		 y=30;
	}
	
public static void main(String[] args) {
		StaticTest3 s2 = new StaticTest3();
		
		System.out.println(s2.x);
		System.out.println(s2.y);
	}

}
