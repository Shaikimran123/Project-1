package com.example.EmployeeSystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeSystem.DAO.EmployeeDAO;
import com.example.EmployeeSystem.exception.UserAlreadyRegisteredException;
import com.example.EmployeeSystem.exception.UserIdNotFound;
import com.example.EmployeeSystem.model.Employee;

import net.bytebuddy.implementation.bytecode.Throw;


@Service
public class EmployeeserviceImp implements EmployeeService{
	
	@Autowired
	EmployeeDAO empDao;
	
	@Override
	public Employee SaveEmp(Employee emp)throws UserAlreadyRegisteredException {
		Employee empFound=getId(emp.getEmpId());
		if(empFound!=null)
			throw new UserAlreadyRegisteredException();
		String name=nameGenerator(emp.getName());
		emp.setName(name);
		return empDao.save(emp);
	}
	private String nameGenerator(String name) {
		
		return name.toUpperCase();
	}


	@Override
	public List<Employee> getAllEmployees() {
		
		return (List<Employee>) empDao.findAll();
	}
	
	@Override
	public Employee updateEmp(Employee emp) {
		
		return empDao.save(emp);
	}
	
	@Override
	public Employee getId(int Empid) {
		Optional<Employee> empOpt=empDao.findById(Empid);
		if(empOpt.isPresent())
			return empOpt.get();				
		return null;
	}
	
	
	@Override
	public String deleteEmp(int empid)throws UserIdNotFound {
		
		Employee emp=getId(empid);
		if(emp!=null) {
			empDao.delete(emp);
			return "Emp deleted";
		}
		throw new UserIdNotFound();
	}
	
//	get employee details by using name
	@Override
	public List<Employee> getEmployeeByName(String name) {
		
		return empDao.findByname(name);
	}
	
//	get employee details by using dept
	@Override
	public List<Employee> getEmployeeByDept(String name) {
	
		return empDao.findBydept(name);
	}
	
	@Override
	public List<Employee> getBydeptAndcity(String dept, String city) {
		
		return empDao.findByDeptAndCity(dept, city);
	}
	
	@Override
	public List<Employee> getEmployeeByqualification(String qualification) {
		
		return empDao.findByqualification(qualification);
	}
	@Override
	public List<Employee> getEmployeeByrating() {
		
		return empDao.findByRating(0);
	}
	@Override
	public List<Employee> getEmployeeByRatingAndQualification() {
		
		return empDao.findByRatingAndQualification(0, null);
	}
	@Override
	public List<Employee> getEmployeeByRatingAndCity(String city) {
		
		return empDao.findByRatingAndCity(city);
	}
	@Override
	public List<Employee> getEmployeeByRatingAndDept() {

		return empDao.findByRatingAndDept();
	}
	@Override
	public List<Employee> getEmployeeByByRatingLesser() {
		
		return empDao.findByRatingLesser();
	}
	@Override
	public List<Employee> getEmployeeByRatingAndUserdept(String dept) {
		
		return empDao.findByRatingAndUserdept(dept);
	}

	
	

}
