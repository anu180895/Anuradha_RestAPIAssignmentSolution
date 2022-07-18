package com.greatlearning.employee.employemanagement.service;

import java.util.List;

import com.greatlearning.employee.employemanagement.model.User;

public interface UserService {

	List<User> getAllUsers();
	
	User getUserById(Integer userId);
	
	User saveUser(User user);
	
	void deleteUserById(Integer userId);
	
}
