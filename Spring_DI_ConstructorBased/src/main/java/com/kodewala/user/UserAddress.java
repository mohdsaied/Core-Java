package com.kodewala.user;

public class UserAddress {
	
	private String address;
	
	private String permanentAdd;

	public UserAddress(String address, String permanentAdd) {
		super();
		this.address = address;
		this.permanentAdd = permanentAdd;
	}
	

	@Override
	public String toString() {
		return "Address is : "+ address +" Permanent Address is : "+permanentAdd;
	}
	
}
