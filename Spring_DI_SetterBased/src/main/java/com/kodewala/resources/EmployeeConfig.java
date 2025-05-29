package com.kodewala.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.employee.Address;
import com.kodewala.employee.Employee;

@Configuration
public class EmployeeConfig {
	
	
	@Bean
	public Employee createEmployee() {
		Employee employee = new Employee("MO SAIED", "mosaied@gmail.com");
		return employee;
	}
	
	
	@Bean
	public Address createAdd() {
		Address address = new Address();
		address.setLocalAdd("Bareilly");
		address.setPermanentAdd("Bareilly UP");
		return address;
	}
	

}
