package com.prasanna;

 class Derived {
	static int x =100;
	
	static {
		x = ++x + --x;
	}

}
class StaticTest extends Derived{
	static {
		x =x-- + --x;
	}
	{
		x =x++ - ++x;
	}
	
	public static void main(String args[]) {
		StaticTest s1 = new StaticTest();
		System.out.println(s1.x);
	}
}