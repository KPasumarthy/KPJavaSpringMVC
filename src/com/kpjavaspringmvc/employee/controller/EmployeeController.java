package com.kpjavaspringmvc.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import com.kpjavaspringmvc.employee.service.*;
//import com.kpjavaspringmvc.employee.service.EmployeeAPIImpl;


import com.kpjavaspringmvc.employee.service.*;
import com.kpjavaspringmvc.employee.service.EmployeeAPI;
import com.kpjavaspringmvc.employee.service.EmployeeAPIImpl;

@Controller
@RequestMapping("/")
public class EmployeeController{
	
	@Autowired
	EmployeeAPIImpl empAPI = null;
	//EmployeeAPI empAPI = null;
	

	@RequestMapping(value = "getAllEmployees", method = RequestMethod.GET)
	public String getAllEmployees(Model model)
	{
		System.out.println("KP : EmployeeController.getAllEmployees() Successful!");		
		model.addAttribute("employees", empAPI.getAllEmployees());
		
		
		System.out.println("KP : EmployeeController :  List<EmployeeVO> getAllEmployees() : " + empAPI.getAllEmployees());
		return "employeesListDisplay";
		//return null;
	}
}