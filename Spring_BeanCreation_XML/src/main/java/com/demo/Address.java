package com.demo;

public class Address {
	
	private String localAddres;
	
	private String permanetAddress;
	
	private int pincode;

	public String getLocalAddres() {
		return localAddres;
	}

	public void setLocalAddres(String localAddres) {
		this.localAddres = localAddres;
	}

	public String getPermanetAddress() {
		return permanetAddress;
	}

	public void setPermanetAddress(String permanetAddress) {
		this.permanetAddress = permanetAddress;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	public void preformTast() {
		System.out.println("Local address : "+ localAddres+ " Permanent Addres : "+permanetAddress+" Pin Code : "+pincode);
	}
	

}
