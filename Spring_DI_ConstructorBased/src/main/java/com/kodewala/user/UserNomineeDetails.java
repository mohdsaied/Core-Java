package com.kodewala.user;

public class UserNomineeDetails {
	
	private String nomineeName;
	
	private String nomineeDOB;
	
	private String nomineeNumber;

	public UserNomineeDetails(String nomineeName, String nomineeDOB, String nomineeNumber) {
		super();
		this.nomineeName = nomineeName;
		this.nomineeDOB = nomineeDOB;
		this.nomineeNumber = nomineeNumber;
	}
	
	
	@Override
	public String toString() {
		return "Nominee Name is : " +nomineeName+ " Nominee DOB :"+ nomineeDOB+ " Nominee Number "+nomineeNumber;
	}
	

}
