package com.user.registration.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.stereotype.Repository;

import com.user.registration.model.UserRegistration;

@Repository
public class UserRegistrationDaoImpl implements UserRegstrationDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private UserRegistrationRowMapper rowMapper;
	
	String ADD_QUERY=" INSERT INTO USER_RESTRATION  (USER_NAME , EMAI_ADDRESS , CREATED_DATE)  VALUES ( :userName , :emailAddress , :data) ";
	String REMOVE_QUERY=" DELETE FROM USER_RESTRATION WHERE USER_NAME=:userName";
	String GET_QUERY=" SELECT * FROM USER_RESTRATION WHERE USER_NAME=:userName";
	
	
    @Autowired
    private NamedParameterJdbcOperations namedParameterJdbcOperations;
    
    
	public void AddRegistration(UserRegistration userRegistration) {

		    MapSqlParameterSource namedParameters = new MapSqlParameterSource();
	        namedParameters.addValue("userName", userRegistration.getUserName());
	        namedParameters.addValue("emailAddress", userRegistration.getEmailAddress());
	        namedParameters.addValue("data", userRegistration.getDate());
	        namedParameterJdbcOperations.update(ADD_QUERY, namedParameters);
	}

	public void removeRegistration(UserRegistration userRegistration) {

	    MapSqlParameterSource namedParameters = new MapSqlParameterSource();
        namedParameters.addValue("userName", userRegistration.getUserName());
        namedParameterJdbcOperations.update(REMOVE_QUERY, namedParameters);
	}

	public UserRegistration getRegistration(UserRegistration userRegistration) {
		
		  MapSqlParameterSource namedParameters = new MapSqlParameterSource();
	     namedParameters.addValue("userName", userRegistration.getUserName());
		 return namedParameterJdbcOperations.queryForObject(GET_QUERY, namedParameters,rowMapper);

	}
	
}
