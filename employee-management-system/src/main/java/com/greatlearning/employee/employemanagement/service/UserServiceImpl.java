package com.greatlearning.employee.employemanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employee.employemanagement.model.Role;
import com.greatlearning.employee.employemanagement.model.User;
import com.greatlearning.employee.employemanagement.repository.RoleDao;
import com.greatlearning.employee.employemanagement.repository.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private RoleDao roleDao;

	@Override
	public List<User> getAllUsers() {
		return userDao.findAll();
	}

	@Override
	public User getUserById(Integer userId) {
			Optional<User> userOptional = userDao.findById(userId);
			if(userOptional.isPresent()) {
				return userOptional.get();
				}
				return null;
	}
	@Override
	public User saveUser(User user) {
		
		List<Role> roles = user.getRoles();
		
		if(roles != null) {
			for(Role role : roles) {
				roleDao.save(role);
			}
		}
		return userDao.save(user);
	}

	@Override
	public void deleteUserById(Integer userId) {
		User user = getUserById(userId);
		userDao.delete(user);
	}

}
