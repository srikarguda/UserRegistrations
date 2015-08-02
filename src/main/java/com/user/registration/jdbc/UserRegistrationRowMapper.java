package com.user.registration.jdbc;

import static com.user.registration.jdbc.UserRegistrationMetaData.DATE;
import static com.user.registration.jdbc.UserRegistrationMetaData.EMAIL_ADDRESS;
import static com.user.registration.jdbc.UserRegistrationMetaData.USER_NAME;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.user.registration.model.UserRegistration;

@Component
public class UserRegistrationRowMapper implements RowMapper<UserRegistration>{

	public UserRegistration mapRow(ResultSet rs, int rowCount)
			throws SQLException {
		UserRegistration ur=new UserRegistration(  rs.getString(USER_NAME.toString()) , rs.getString(EMAIL_ADDRESS.toString()), rs.getString(DATE.toString()));
		return ur;
	}

}
