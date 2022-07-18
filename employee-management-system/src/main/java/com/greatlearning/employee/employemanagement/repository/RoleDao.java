package com.greatlearning.employee.employemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.employee.employemanagement.model.Role;

@Repository
public interface RoleDao extends JpaRepository<Role, Integer>{

}
