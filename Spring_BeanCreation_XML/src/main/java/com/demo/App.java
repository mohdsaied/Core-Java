package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	
	
	
	
  public static void main(String[] args) {
	  
	  String context = "/com/demo/resources/applicationContext.xml";
	  
	 ApplicationContext application = new ClassPathXmlApplicationContext(context);
	 
	 Employee emp = (Employee)application.getBean("myEmpObj");
	 
	 ApplicationContext context2 = new ClassPathXmlApplicationContext(context);
	 
	 Address add = (Address) context2.getBean("myAddObj");
	 
	 emp.doSomething();	  
	 
	 add.preformTast();
	 
  }
}
