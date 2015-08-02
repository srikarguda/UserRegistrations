package com.user.registration.model;


public class UserRegistration {

	
	private String userName;
	private String emailAddress;
	private String date;
	private String status;
	
	
	
	
	public UserRegistration(String userName , String emailAddress , String date) {
		this.userName=userName;
		this.emailAddress=emailAddress;
		this.date=date;
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
}
