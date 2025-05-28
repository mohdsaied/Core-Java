package com.kodewala.employee;

public class SalaryInfo {
	
	private int totalSalary;
	
	private int pf;
	
	private InsurenceInfo info;

	public SalaryInfo(int totalSalary, int pf, InsurenceInfo info) {
		super();
		this.totalSalary = totalSalary;
		this.pf = pf;
		this.info = info;
	}
	
	public String toString() {
		return "Total Salary is : "+totalSalary +"PF :"+pf +" Insurence Info :"+info.toString();
	}
}
