package com.kodewala.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.beans.Employee;
import com.kodewala.resources.SpringConfig;

public class App {
	
	
  public static void main(String[] args) {
	  
	  ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
	  
	  Employee employee = (Employee)context.getBean("creatEmployee");
	  employee.fromEployee();  
	  
	  String s = null;
	  
	  System.out.println(s.length());
  }
}
