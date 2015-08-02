package com.user.registration.jdbc;

import com.user.registration.model.UserRegistration;

public interface UserRegstrationDao  {

	public void AddRegistration(UserRegistration userRegistration);

	public void removeRegistration(UserRegistration userRegistration);

	public UserRegistration getRegistration(UserRegistration userRegistration);
}
