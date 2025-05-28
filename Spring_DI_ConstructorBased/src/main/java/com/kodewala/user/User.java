package com.kodewala.user;


public class User {
	
	private Integer id;
	
	private String name;
	
	private String emailId;
	
	private String Password;
	
	private UserAddress userAddress;
	
	private UserNomineeDetails userNomineeDetails;

	public User(Integer id, String name, String emailId, String password, UserAddress userAddress,
			UserNomineeDetails userNomineeDetails) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		Password = password;
		this.userAddress = userAddress;
		this.userNomineeDetails = userNomineeDetails;
	}
	
	public void returnEmployee() {
		System.out.println("User ID : "+id);
		System.out.println("User Name : "+name);
		System.out.println("User Email Id : "+emailId);
		System.out.println("Passsword : "+ Password);
		System.out.println("UserAddress = "+userAddress);
		System.out.println("Nominee Details is = "+userNomineeDetails);
		
	}

}










