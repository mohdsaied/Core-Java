package com.kodewala.beans;



public class Employee {
	
	private String name;
	
	private String email;
	
	private SalaryInfo salaryInfo;
	
	private InsurenceInfo insurenceInfo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public SalaryInfo getSalaryInfo() {
		return salaryInfo;
	}

	public void setSalaryInfo(SalaryInfo salaryInfo) {
		this.salaryInfo = salaryInfo;
	}

	public InsurenceInfo getInsurenceInfo() {
		return insurenceInfo;
	}

	public void setInsurenceInfo(InsurenceInfo insurenceInfo) {
		this.insurenceInfo = insurenceInfo;
	}

	public void fromEployee() {
		System.out.println("Employee Name = "+name);
		System.out.println("Email = "+email);
		System.out.println("Base salary is  = "+ salaryInfo.getBaseSal());
		System.out.println("Total salary is = "+salaryInfo.getTotalSal());
		System.out.println("Insurence INformation is = "+ insurenceInfo.getCoverate());
	}

}
