package com.user.registration.jdbc;

public enum UserRegistrationMetaData {

	USER_NAME("user_name"), EMAIL_ADDRESS("emai_address"), DATE("created_date"), TABLE(
			"user_registration");

	private String name;

	private UserRegistrationMetaData(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
