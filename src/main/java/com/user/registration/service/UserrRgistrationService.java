package com.user.registration.service;

import com.user.registration.model.UserRegistration;

public interface UserrRgistrationService {

	public void AddRegistration(UserRegistration userRegistration);

	public void removeRegistration(UserRegistration userRegistration);

	public UserRegistration getRegistration(UserRegistration userRegistration);
}
