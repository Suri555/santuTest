package com.test;


 class One{
	public void display() {
		System.out.println("One");
	}
}
 //inheritance
 class Two extends One{
	 @Override
	 public void display() {
		 System.out.println("Two");
	 }
	 
	 public int add(int x, int y) {
		 return x+y;
	 }
	 //Overload   //Polymorphism
	 public double add(double x, double y) {
		 return x+y;
	 }
 }
 
 //Encapsulation
 class EncapTest{
	 private String name;
	 
	 public void setName(String name) {
		 this.name=name;
	 }
	 public String getName() {
		 return name;
	 }
 }
 
 //Abstraction
 abstract class Vehicle{
	 public abstract void run();
 }
 
 class Bike extends Vehicle{

	@Override
	public void run() {
		System.out.println("Bike is running");
	}
	 
 }
public class OopsConcept {

	public static void main(String[] args) {

		One one = new One();
		one.display();
		
		Two two = new Two();
		two.display();
		
		System.out.println(two.add(2, 3));
		System.out.println(two.add(2.0, 4.0));//Polimorphism
		
		EncapTest encapTest = new EncapTest();
		encapTest.setName("Santhu");
		System.out.println("Name: "+encapTest.getName());
		
		Vehicle vehicle = new Bike();
		vehicle.run();
		
	}

}

