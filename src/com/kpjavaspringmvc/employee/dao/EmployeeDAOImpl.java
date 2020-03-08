package com.kpjavaspringmvc.employee.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import  com.kpjavaspringmvc.employee.model.EmployeeVO;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	// KP : EmployeeVO is Employee Model to View Object  
	public List<EmployeeVO> getAllEmployees() 
	{
		
		System.out.println("KP : EmployeeDAOImpl :  List<EmployeeVO> getAllEmployees() : Successful!");
		
		List<EmployeeVO> employees = new ArrayList<EmployeeVO>();		

		
		//empVO ID : 1
		EmployeeVO empVO1 = new EmployeeVO();
		empVO1.setId(1);
		empVO1.setFirstName("Kailash");
		empVO1.setLastName("Pasumarthy");
		employees.add(empVO1);			
		
		//empVO ID : 2
		EmployeeVO empVO2 = new EmployeeVO();
		empVO2.setId(2);
		empVO2.setFirstName("Srinidhi");
		empVO2.setLastName("Pasumarthy");
		employees.add(empVO2);

		//empVO ID : 3
		EmployeeVO empVO3 = new EmployeeVO();
		empVO3.setId(3);
		empVO3.setFirstName("Madhu");
		empVO3.setLastName("Pasumarthy");
		employees.add(empVO3);
		
		//empVO ID : 4
		EmployeeVO empVO4 = new EmployeeVO();
		empVO4.setId(3);
		empVO4.setFirstName("Gaytri");
		empVO4.setLastName("Pasumarthy");
		employees.add(empVO4);
		
		return employees;
	}
	
}