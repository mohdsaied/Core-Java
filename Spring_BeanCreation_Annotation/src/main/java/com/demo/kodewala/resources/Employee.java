package com.demo.kodewala.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component
public class Employee {
	
	
	@Value("MO")
	private String firstName;
	
	@Value("SAIED")
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
		System.out.println("First Name : "+firstName+" Last Name : "+lastName);
	}

}
