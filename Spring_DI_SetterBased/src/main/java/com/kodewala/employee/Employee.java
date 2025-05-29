package com.kodewala.employee;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private String name;
	
	private String email;
	
	
	@Autowired
	private Address address;
	
	public Employee(String name, String email) {
		this.name=name;
		this.email=email;
	}
	
	@Override
	public String toString() {
		return "Employee Name :"+name+ " Employee Email : "+email+ " Local Add : "
	+address.getLocalAdd()+" Permanenr Add : "+address.getPermanentAdd();
	}
}
