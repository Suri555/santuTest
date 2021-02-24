package com.prasanna;

public class Employee {
	
	private int id;
	private String name;
	private String address;
	
	

	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}



	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Santhu","Mandya");
		Employee e2 = new Employee(2,"kumar","Mandya");
		Employee e3 = new Employee(3,"abhi","Mandya");
		
		Employee arr[] = new Employee[5];
		
		arr[0]=e1;
		arr[3]=e2;
		arr[4]=e3;
		
		for(Object ee:arr) {
			if(ee instanceof Employee) {
				Employee e=(Employee)ee;
				System.out.println(e.id+ " " +e.name+" "+e.address);
				
			}
			if(ee==null) {
				System.out.println(ee);
			}
		}
	}

}
