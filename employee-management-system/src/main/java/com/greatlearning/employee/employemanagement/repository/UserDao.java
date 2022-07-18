package com.greatlearning.employee.employemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.employee.employemanagement.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{
	
	User findByUsername(String username);

}
