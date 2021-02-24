package com.stringss;

class B{
	public static int a=10;
	public int b =10;
	
	public static void display() {
		System.out.println("Display");
	}
	B(){
		System.out.println("Hii");
	}
}

public class Name {
	

	public static void main(String[] args) {
		
		B b = new B();
		b.display();

		System.out.println(B.a);
		String name="santhu";
		
		System.out.println(name);
		
		name="Praveen";
		
		System.out.println(name);
	}

}

