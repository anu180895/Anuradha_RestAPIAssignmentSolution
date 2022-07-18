package com.greatlearning.employee.employemanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employee.employemanagement.model.Role;
import com.greatlearning.employee.employemanagement.repository.RoleDao;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleDao roleDao;

	@Override
	public List<Role> getAllRoles() {
		return roleDao.findAll();
	}

	@Override
	public Role getRoleById(Integer roleId) {
		Optional<Role> roleOptional = roleDao.findById(roleId);
		if(roleOptional.isPresent()) {
			return roleOptional.get();
			}
			return null;
	}

	@Override
	public Role saveRole(Role role) {
		return roleDao.save(role);
	}

	@Override
	public Role editRoleById(Integer roleId, String name) {
		Role role = getRoleById(roleId);
		role.setName(name);
		return roleDao.save(role);
	}

	@Override
	public void deleteRoleById(Integer roleId) {
		Role role = getRoleById(roleId);
		roleDao.delete(role);
	}

}
