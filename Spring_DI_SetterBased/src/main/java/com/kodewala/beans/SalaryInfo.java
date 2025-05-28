package com.kodewala.beans;

public class SalaryInfo {
	
	private int baseSal;
	
	private int totalSal;

	public int getBaseSal() {
		return baseSal;
	}

	public void setBaseSal(int baseSal) {
		this.baseSal = baseSal;
	}

	public int getTotalSal() {
		return totalSal;
	}

	public void setTotalSal(int totalSal) {
		this.totalSal = totalSal;
	}
	
	public void Salary() {
		System.out.println("Base Salary is = "+baseSal);
		System.out.println("Total Salary is = "+totalSal);
	}

}
