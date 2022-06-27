package com.ashok;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository empRepository;
	 
	public Employee createEmployee(Employee emp) {
	    return empRepository.save(emp);
	}

	public List<Employee> getEmployees() {
	    return empRepository.findAll();
	}
}
