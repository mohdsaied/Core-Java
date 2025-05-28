package com.demo.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.resources.SpringConfig;

public class App {
	
	
  public static void main(String[] args) {
	  
	  ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
	  
	  Employee employee = (Employee) context.getBean("employee");
	  
	  employee.doSomething(); 
	  
  }
}
