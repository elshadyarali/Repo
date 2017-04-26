package com.mumsched.us.services;

import java.util.List;

import com.mumsched.us.domain.User;

public interface UserService {

	void createUser(User user);
	User getUser(Long id);
	List<User> getAllUsers();
	void updateUser(User user);
	void deleteUser(Long id);
	User getUserbyLoginId(String id);

	User login(String loginId,String password );
	
}
