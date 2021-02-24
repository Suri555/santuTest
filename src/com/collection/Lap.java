package com.collection;

public class Lap {
	
	private int id;
	
	private int price;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lap other = (Lap) obj;
		if (id != other.id)
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
	

}
