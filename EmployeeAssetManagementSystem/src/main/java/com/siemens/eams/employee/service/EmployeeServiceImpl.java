package com.siemens.eams.employee.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.siemens.eams.employee.domain.Employee;
import com.siemens.eams.employee.domain.EmployeeRepository;
@Component
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired  
	EmployeeRepository empRepo; 
	
	@Value("${employee.users}")
	private String users;
	
	public List<Employee> getAllEmployees()   
	{  
	List<Employee> empList = new ArrayList<Employee>();  
	Iterable<Employee> emp = empRepo.findAll();
	System.out.println("23432444444443-------"+emp);
	Iterator it = emp.iterator();
	while (it.hasNext()) {
			empList.add((Employee)it.next());
		}
	return empList;  
	} 
	
	public boolean loadUserByUsername(String user)   
	{
		String usrarr[] = users.split(",");
		List usrList = Arrays.asList(usrarr);
		return usrList.contains(user);
		
	}
	 

}
