package com.krishna.training.service;

import java.util.Arrays;
import java.util.List;

import com.krishna.training.dao.EmployeeDao;
import com.krishna.training.model.Employee;


public class EmployeeService {
	
	
	private String name;
	
	private EmployeeDao employeeDao;
	
	
	
	
	public List<Employee> getEmployees(){
		return Arrays.asList(new Employee("Raju", "IT"), new Employee("Rakesh", "Networking"),
				new Employee("Teja", "HR"));
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}



	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

}
