package com.cognizant.springlearn.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.dao.EmployeeDao;
import com.cognizant.springlearn.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao; 
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);
	
	
	public List<Employee> getAllEmployees(){
		LOGGER.info("START");
		LOGGER.info("END");
		return employeeDao.getAllEmployees();
	}

}
