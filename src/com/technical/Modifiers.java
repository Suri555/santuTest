package com.technical;


class A {
	 public void run() {
		System.out.println("class - A");
	}
}

class B extends A{
	public void run() {
		System.out.println("class - B");
	}
}

class Modifiers{
	public static void main(String args[]) {
		A a = new B();
		a.run();
	}
}

