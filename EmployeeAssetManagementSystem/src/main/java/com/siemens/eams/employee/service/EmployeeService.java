package com.siemens.eams.employee.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.siemens.eams.employee.domain.Employee;


public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	
	public boolean loadUserByUsername(String user);

}
