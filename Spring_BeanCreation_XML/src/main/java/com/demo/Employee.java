package com.demo;

public class Employee {
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void doSomething() {
		System.out.println("First : "+ firstName+ " Last Name : "+ lastName+ " Email id : "+email);
	}
	
	

}
