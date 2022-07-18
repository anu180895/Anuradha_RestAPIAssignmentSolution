package com.greatlearning.employee.employemanagement.service;

import java.util.List;

import com.greatlearning.employee.employemanagement.model.Role;

public interface RoleService {
	
	List<Role> getAllRoles();
	Role getRoleById(Integer roleId);
	Role saveRole(Role role);
	Role editRoleById(Integer roleId, String name);
	void deleteRoleById(Integer roleId);

}
