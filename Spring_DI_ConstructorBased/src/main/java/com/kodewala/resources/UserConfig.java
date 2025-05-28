package com.kodewala.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.user.User;
import com.kodewala.user.UserAddress;
import com.kodewala.user.UserNomineeDetails;

@Configuration
public class UserConfig {
	
	
	@Bean
	public User createUser() {
		User user = new User(1, "Mo SAIED", "mosaied@gmail.com", "mo@123", CreateAddress(), createNomineeDetails());
		user.returnEmployee();
		return user;
		
	}
	
	
	@Bean
	public UserAddress CreateAddress() {
		
		UserAddress address = new UserAddress("Bareilly", "Bareilly UP");
		return address;
	}

	
	@Bean
	public UserNomineeDetails createNomineeDetails() {
		
		UserNomineeDetails details = new UserNomineeDetails("Sarfraj", "10/08/2001", "899999999");
		return details;
		}
	}








