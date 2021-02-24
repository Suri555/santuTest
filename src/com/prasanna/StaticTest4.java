package com.prasanna;

public class StaticTest4 {
	static int x;
	public int y;
	
	
	static {
	 x=20;
	}
	
	public static void main(String[] args) {
		StaticTest4 s = new StaticTest4();
		System.out.println(s.x);
		System.out.println(StaticTest4.x);
		
		System.out.println(s.y);
		
	}

}
