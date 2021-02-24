package com.exception;

public class Propogation {
	void m() {
		int x=50/0;
	}
	void n()
	{
		m();
	}
	void p() {
		try {
			n();
		}
		catch(Exception e) {
			System.out.println("Exception is handled");
		}
	}

	public static void main(String[] args) {

		Propogation propogation = new Propogation();
		propogation.n();
		System.out.println("Normal Flow");
	}

}
