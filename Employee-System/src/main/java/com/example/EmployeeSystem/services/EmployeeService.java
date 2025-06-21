package com.example.EmployeeSystem.services;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.example.EmployeeSystem.exception.UserAlreadyRegisteredException;
import com.example.EmployeeSystem.exception.UserIdNotFound;
import com.example.EmployeeSystem.model.Employee;

@Service
public interface EmployeeService {
	
	public Employee SaveEmp(Employee emp) throws UserAlreadyRegisteredException;
	
	public List<Employee> getAllEmployees();
	
	public Employee updateEmp(Employee emp);
	
	public Employee getId(int Empid);
	
	public String deleteEmp(int empid) throws UserIdNotFound;
	
//	get employee details by using name
	public List<Employee> getEmployeeByName(String name);
	
//	get employee details by using name
	public List<Employee> getEmployeeByDept(String name);
		
	public List<Employee> getBydeptAndcity(String dept,String city);
	
	public List<Employee> getEmployeeByqualification(String qualification);
	
	public List<Employee> getEmployeeByrating();
	
	public List<Employee> getEmployeeByRatingAndQualification();
	
	public List<Employee> getEmployeeByRatingAndCity(String city);
	
	public List<Employee> getEmployeeByRatingAndDept();
	
	public List<Employee> getEmployeeByByRatingLesser();
	
	public List<Employee> getEmployeeByRatingAndUserdept(String dept);
}
