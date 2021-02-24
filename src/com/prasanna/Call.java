package com.prasanna;

public class Call {

	int calls(int a, int b) {
		return (a>b?a:b);
	}
	public static void main(String[] args) {
		Call c = new Call();
		System.out.println(c.calls(23, 23));
		System.out.println(c.calls(c.calls(c.calls(23, -32), 23), 8));
	
	}

}
