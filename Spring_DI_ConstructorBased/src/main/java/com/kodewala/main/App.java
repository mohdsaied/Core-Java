package com.kodewala.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.employee.Employee;
import com.kodewala.resources.EmployeeConfig;
import com.kodewala.resources.UserConfig;
import com.kodewala.user.User;

public class App {
  public static void main(String[] args) {
	  
	  ApplicationContext context1 = new AnnotationConfigApplicationContext(EmployeeConfig.class);
	  Employee employee = (Employee)context1.getBean("createEmployee");
	  System.out.println(employee);
	  
	  
	  ApplicationContext context2 = new AnnotationConfigApplicationContext(UserConfig.class);
	  User user = (User) context2.getBean("createUser");
//	  user.toString();
  }
}
