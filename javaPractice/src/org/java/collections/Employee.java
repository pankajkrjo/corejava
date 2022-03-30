package org.java.collections;

public class Employee {
	
	String name;
	String city;
	String email;
	public Employee(String name, String city, String email) {
		super();
		this.name = name;
		this.city = city;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", email=" + email + "]";
	}
	
	

}
