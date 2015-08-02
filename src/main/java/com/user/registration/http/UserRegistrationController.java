package com.user.registration.http;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.user.registration.model.UserRegistration;
import com.user.registration.service.UserrRgistrationService;

@RestController
public class UserRegistrationController {

	private static final String SUCESS = "Sucess";
	@Autowired
	UserrRgistrationService regstrationService;

	@RequestMapping(value = "/add/{userName}/{emailAddress}/{date}", method = RequestMethod.GET)
	public UserRegistration addRegistration(
			@PathVariable(value = "userName") String userName,
			@PathVariable(value = "emailAddress") String emailAddress,
			@PathVariable(value = "date") String date) {

		UserRegistration userRegistration = new UserRegistration(userName,
				emailAddress, date);
		regstrationService.AddRegistration(userRegistration);
		userRegistration.setStatus(SUCESS);
		return userRegistration;

	}

	@RequestMapping(value = "/remove/{userName}", method = RequestMethod.GET)
	public UserRegistration rmoveRegisteredUser(
			@PathVariable(value = "userName") String userName) {
		String emailAddress = null;
		String data = null;
		UserRegistration userRegistration = new UserRegistration(userName,
				emailAddress, data);
		regstrationService.removeRegistration(userRegistration);
		userRegistration.setStatus(SUCESS);
		return userRegistration;
	}

	@RequestMapping(value = "/get/{userName}", method = RequestMethod.GET)
	public UserRegistration getRegisteredUser(
			@PathVariable(value = "userName") String userName) {
		String emailAddress = null;
		String data = null;
		UserRegistration userRegistration = new UserRegistration(userName,
				emailAddress, data);
		userRegistration=regstrationService.getRegistration(userRegistration);
		userRegistration.setStatus(SUCESS);
		return userRegistration;
	}
}
