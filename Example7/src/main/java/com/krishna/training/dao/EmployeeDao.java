package com.krishna.training.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.krishna.training.model.Employee;

@Repository
public class EmployeeDao {

	
	
	public List<Employee> getEmployees(){
		return Arrays.asList(new Employee("Raju", "IT"), new Employee("Rakesh", "Networking"),
				new Employee("Teja", "HR"));
	}
}
