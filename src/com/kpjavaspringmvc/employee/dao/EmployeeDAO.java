package com.kpjavaspringmvc.employee.dao;

import java.util.List;

import com.kpjavaspringmvc.employee.model.EmployeeVO;

public interface EmployeeDAO 
{
	public List<EmployeeVO> getAllEmployees();
}