package com.demo.kodewala;



public class Employee {
	
	private String firstName;
	
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void doSomething() {
		System.out.println("First Name : "+firstName+ "Last Name : "+lastName);
	}

}
