package com.demo.kodewala.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.kodewala.resources.AppConfig;
import com.demo.kodewala.resources.Employee;

public class App {
	

  public static void main(String[] args) {
	  
	  ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	  
	  Employee emp = context.getBean(Employee.class);
	  
	  emp.doSomething();
	  
  }
}
