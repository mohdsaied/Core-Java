package com.kodewala.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.employee.Employee;
import com.kodewala.employee.InsurenceInfo;
import com.kodewala.employee.SalaryInfo;

@Configuration
public class EmployeeConfig {
	
	
	@Bean
	public Employee createEmployee() {
		 
		Employee employee = new Employee(1, "MO SAIED", "mosaied00786@gmail.com", createSalary());
		return employee;
	}
	
	public SalaryInfo createSalary() {
		SalaryInfo salaryInfo = new SalaryInfo(100000, 2000, createInsurence());
		return salaryInfo;
	}
	
	
	public InsurenceInfo createInsurence() {
		
		InsurenceInfo info = new InsurenceInfo(2000);
		return info;
	}

}
