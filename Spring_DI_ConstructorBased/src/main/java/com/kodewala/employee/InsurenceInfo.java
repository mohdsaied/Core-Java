package com.kodewala.employee;

public class InsurenceInfo {
	
	private int insurence;

	public InsurenceInfo(int insurence) {
		super();
		this.insurence = insurence;
	}

	
	@Override
	public String toString() {
		return "Insurence Price : "+insurence;
	}

}
