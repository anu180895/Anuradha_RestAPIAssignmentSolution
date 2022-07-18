package com.greatlearning.employee.employemanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.greatlearning.employee.employemanagement.model.Employee;
import com.greatlearning.employee.employemanagement.repository.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.findAll();
	}
	
	@Override
	public List<Employee> getAllEmployeeSortedByFirstName(Direction direction) {
		return employeeDao.findAll(Sort.by(direction, "firstName"));
	}

	@Override
		public Employee getEmployeeById(Integer employeeId) {
			Optional<Employee> employeOptional = employeeDao.findById(employeeId);
		
		if(employeOptional.isPresent()) {
			return employeOptional.get();
		}
		return null;
		
		}

	@Override
	public List<Employee> getEmployeeByFirstName(String firstName) {
		List<Employee> listOfEmployeeByFirstName = employeeDao.findEmployeeByFirstName(firstName);
		return listOfEmployeeByFirstName;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public void deleteEmployeeById(Integer employeeId) {
		employeeDao.deleteById(employeeId);
	}
	
	@Override
	public Employee editEmployeeById(Integer employeeId, Employee employee) {
		Employee employeeFromDB = getEmployeeById(employeeId);
		employeeFromDB.setFirstName( employee.getFirstName() );
		employeeFromDB.setLastName( employee.getLastName() );
		employeeFromDB.setEmail( employee.getEmail() );
		return saveEmployee(employeeFromDB);
	}

}
