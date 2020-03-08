package com.kpjavaspringmvc.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpjavaspringmvc.employee.dao.EmployeeDAO;
import com.kpjavaspringmvc.employee.model.EmployeeVO;

@Service
public class EmployeeAPIImpl implements EmployeeAPI {

	@Autowired
	EmployeeDAO dao;
	
	public List<EmployeeVO> getAllEmployees() 
	{
		System.out.println("KP : EmployeeAPIImpl : List<EmployeeVO> getAllEmployees() Successful!");
		return dao.getAllEmployees();
	}
}
