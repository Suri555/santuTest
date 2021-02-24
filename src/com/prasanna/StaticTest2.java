package com.prasanna;

public class StaticTest2 {
	
	static int i =-1;
	public static int increment() {
		return i--;
	}
	
	public static int decrement() {
	return 	--i;
	}

	public static void main(String[] args) {
		StaticTest2 s1 = new StaticTest2();
		StaticTest2.decrement();
		System.out.println(s1.increment());
		System.out.println(s1.decrement());
		System.out.println(StaticTest2.i);
		StaticTest2 s2 = new StaticTest2();
		System.out.println(s2.i);
		
	}

}
