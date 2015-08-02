package com.user.registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.registration.jdbc.UserRegstrationDao;
import com.user.registration.model.UserRegistration;

@Service
public class UserrRgistrationServiceImpl  implements UserrRgistrationService{

	@Autowired
	UserRegstrationDao  userRegstrationDao;
	
	public void AddRegistration(UserRegistration userRegistration) {
		userRegstrationDao.AddRegistration(userRegistration);
		
	}

	public void removeRegistration(UserRegistration userRegistration) {
		userRegstrationDao.removeRegistration(userRegistration);
	}

	public UserRegistration getRegistration(UserRegistration userRegistration) {
		return userRegstrationDao.getRegistration(userRegistration);
	}
}
