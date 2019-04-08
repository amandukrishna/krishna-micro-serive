package com.krishna.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.krishna.training.service.EmployeeService;

@Controller
@RequestMapping("employee")
public class EmployeeController {
	

	@Autowired
	private EmployeeService employeeService;


	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {

		System.out.println("EmployeeService ::" + employeeService);
		this.employeeService = employeeService;
	}

	@PostMapping("/employees")
	public String getEmployees(Model model) {
		System.out.println("employeeServiceName ::" + employeeService.getName());
		return "hello";
	}
   
	@RequestMapping("/login" )
	public String loginEmployee(ModelMap model) {
		System.out.println("loginEmployee ::" + employeeService.getName());
		return "login";
	}
   
	@RequestMapping("/order" )
	public String order(ModelMap model) {
		System.out.println("loginEmployee ::" + employeeService.getName());
		return "order";
	}

}
