package com.siemens.eams.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.siemens.eams.employee.domain.Employee;
import com.siemens.eams.employee.domain.EmployeeRepository;
@Component
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired  
	EmployeeRepository empRepo; 
	
	public List<Employee> getAllEmployees()   
	{  
	List<Employee> empList = new ArrayList<Employee>();  
	empRepo.findAll().forEach(emp -> empList.add(emp));  
	return empList;  
	}  
	 

}
