package com.demo.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.kodewala.Employee;

@Configuration
public class SpringConfig {
	
	
	@Bean("employee")
	public Employee createEmployee() {
		
		Employee employee = new Employee();
		
		employee.setFirstName("MO");
		employee.setLastName("SAIED");
		
		return employee;
	}

}
