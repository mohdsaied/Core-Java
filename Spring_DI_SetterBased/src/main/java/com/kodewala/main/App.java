package com.kodewala.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.employee.Employee;
import com.kodewala.resources.EmployeeConfig;

public class App {
  public static void main(String[] args) {
	  
	  ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
	  Employee employee = (Employee) context.getBean("createEmployee");
	  System.err.println(employee);
	  
  }
}
