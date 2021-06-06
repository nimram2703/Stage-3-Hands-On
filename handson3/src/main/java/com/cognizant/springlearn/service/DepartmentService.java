package com.cognizant.springlearn.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.dao.DepartmentDao;
import com.cognizant.springlearn.model.Department;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentDao departmentDao;
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);
	
	public List<Department> getAllDepartments() {
		LOGGER.info("START");
		LOGGER.info("END");
		return departmentDao.getAllDepartments();
	}

}
