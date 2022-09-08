package com.siemens.eams.employee.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siemens.eams.employee.domain.Employee;
import com.siemens.eams.employee.service.EmployeeService;

@RestController

public class EmployeeController {
	@Autowired  
	EmployeeService empService;  
	//creating a get mapping that retrieves all the students detail from the database   
	@GetMapping(value ="/getEmployee",produces=MediaType.APPLICATION_XML_VALUE)  
	private List<Employee> getAllEmployees()   
	{  
	return empService.getAllEmployees();  
	}  
}
