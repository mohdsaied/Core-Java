package com.kodewala.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.beans.Employee;
import com.kodewala.beans.InsurenceInfo;
import com.kodewala.beans.SalaryInfo;

@Configuration
public class SpringConfig {
	
	
	@Bean
	public Employee creatEmployee() {
		
		Employee employee = new Employee();
		employee.setName("Mo SAIED");
		employee.setEmail("mosaied00786@gmail.com");
		employee.setSalaryInfo(createSalary());
		employee.setInsurenceInfo(createInsurence());
		
		return employee;
		
	}

	@Bean
	public SalaryInfo createSalary() {
		
		SalaryInfo saInfo = new SalaryInfo();
		saInfo.setBaseSal(100000);
		saInfo.setTotalSal(80000);
		return saInfo;
		
	}
	
	@Bean
	public InsurenceInfo createInsurence() {
		
		InsurenceInfo info = new InsurenceInfo();
		info.setCoverate(60000);
		return info;
		
	}
}
