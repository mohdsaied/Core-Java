package com.kodewala.employee;

public class Employee {
	
	
	private int id;
	
	private String name;
	
	private String email;
	
	private SalaryInfo salaryInfo;

	public Employee(int id, String name, String email, SalaryInfo salaryInfo) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salaryInfo = salaryInfo;
	}
	 public String toString()
	 {
		 return "Id : "+id+ " Name : "+name + " Email : "+ email + "Salary Info :"+salaryInfo;
	 }
}
