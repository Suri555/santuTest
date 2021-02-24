package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopTest {

	public static void main(String[] args) {

		List<Laptop> laps = new ArrayList<Laptop>();
		
		laps.add(new Laptop("Dell", 12 , 700));
		laps.add(new Laptop("Apple", 6 , 900));
		laps.add(new Laptop("Acer", 10 , 800));
		
//		Collections.sort(laps,);
		
//		for(LaptopDetails l:laps) {
//			System.out.println(l);
//		}
	}

}
