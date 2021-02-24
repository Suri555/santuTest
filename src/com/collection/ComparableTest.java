package com.collection;

import java.util.ArrayList;
import java.util.List;

class Laptop {
	private String name;
	private int ram;
	private int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Laptop(String name, int ram, int price) {
		super();
		this.name = name;
		this.ram = ram;
		this.price = price;
	}

}

public class ComparableTest {

	public static void main(String args[]) {
		List<Laptop> laps = new ArrayList<Laptop>();
		laps.add(new Laptop("Dell", 12, 800));
		laps.add(new Laptop("Apple", 8, 900));
		laps.add(new Laptop("Acre", 10, 600));
	}
}
