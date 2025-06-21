package com.example.EmployeeSystem.Ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeSystem.exception.UserAlreadyRegisteredException;
import com.example.EmployeeSystem.exception.UserIdNotFound;
import com.example.EmployeeSystem.model.Employee;
import com.example.EmployeeSystem.services.EmployeeService;


@CrossOrigin
@RestController
@RequestMapping("Employees")
public class EmployeeCrtl {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping()
	public ResponseEntity<Object> postData(@RequestBody Employee emp1)throws UserAlreadyRegisteredException{
		Employee employee=employeeService.SaveEmp(emp1);
		return new ResponseEntity<Object>(employee,HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<Employee>> getAllEmployees(){	
		List<Employee> emp= employeeService.getAllEmployees();
		return new ResponseEntity<List<Employee>>(emp,HttpStatus.OK);
	}
	
	@GetMapping("{empid}")
	public ResponseEntity<Employee> getemp(@PathVariable int empid){	
		Employee emp= employeeService.getId(empid);
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Employee> updateemp(@RequestBody Employee emp){
		Employee employee= employeeService.updateEmp(emp);
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}
	
	@DeleteMapping("{empid}")
	public ResponseEntity<String> delEmp(@PathVariable int empid)throws UserIdNotFound{
	String res= employeeService.deleteEmp(empid);
		return new ResponseEntity<String>(res,HttpStatus.OK);
	}
	
//	get employee details by using name
	@GetMapping("name/{name}")
	public ResponseEntity<Object> getEmp(@PathVariable String name)
	{
		
	List<Employee> employees=employeeService.getEmployeeByName(name);
		
			if(employees.size()!=0)
		return new ResponseEntity<Object>(employees,HttpStatus.OK);
		
			else
				return new ResponseEntity<Object>("Data Not FOund",HttpStatus.OK);		
		
	}
	
//	get employee details by using name
	@GetMapping("dept/{name}")
	public ResponseEntity<Object> getDept(@PathVariable String name)
	{
		
	List<Employee> employees=employeeService.getEmployeeByDept(name);
		
			if(employees.size()!=0)
		return new ResponseEntity<Object>(employees,HttpStatus.OK);
		
			else
				return new ResponseEntity<Object>("Data Not FOund",HttpStatus.OK);		
		
	}
//
	@GetMapping("dept/{name}/city/{city}")
	public ResponseEntity<Object> getDeptandcity(@PathVariable String name,@PathVariable String city)
	{
		
	List<Employee> employees=employeeService.getBydeptAndcity(name,city);
		
			if(employees!=null)
		return new ResponseEntity<Object>(employees,HttpStatus.OK);
		
			else
				return new ResponseEntity<Object>("Data Not FOund",HttpStatus.OK);		
		
	}
	@GetMapping("qualification/{name}")
	public ResponseEntity<Object> getqualification(@PathVariable String name)
	{
		
	List<Employee> employees=employeeService.getEmployeeByqualification(name);
		
	if(employees.size()!=0)
		return new ResponseEntity<Object>(employees,HttpStatus.OK);
	else
		return new ResponseEntity<Object>("Data Not FOund",HttpStatus.OK);		
		
	}
	
	@GetMapping("rating")
	public ResponseEntity<Object> getrating()
	{
		
	List<Employee> employees=employeeService.getEmployeeByrating();

	if(employees!=null)
		return new ResponseEntity<Object>(employees,HttpStatus.OK);
	else
		return new ResponseEntity<Object>("Data Not FOund",HttpStatus.OK);		
		
	}
	@GetMapping("raq")
	public ResponseEntity<Object> getratingandqualification()
	{
		
	List<Employee> employees=employeeService.getEmployeeByRatingAndQualification();

	if(employees.size()!=0)
		return new ResponseEntity<Object>(employees,HttpStatus.OK);
	else
		return new ResponseEntity<Object>("Data Not FOund",HttpStatus.OK);		
		
	}
	
	@GetMapping("rac/{city}")
	public ResponseEntity<Object> getratingandcity(@PathVariable String city)
	{
		
	List<Employee> employees=employeeService.getEmployeeByRatingAndCity(city);

	if(employees.size()!=0)
		return new ResponseEntity<Object>(employees,HttpStatus.OK);
	else
		return new ResponseEntity<Object>("Data Not FOund",HttpStatus.OK);		
		
	}
	
	@GetMapping("rad")
	public ResponseEntity<Object> getratinganddept()
	{
		
	List<Employee> employees=employeeService.getEmployeeByRatingAndDept();

	if(employees.size()!=0)
		return new ResponseEntity<Object>(employees,HttpStatus.OK);
	else
		return new ResponseEntity<Object>("Data Not FOund",HttpStatus.OK);		
		
	}
	
	@GetMapping("rateless")
	public ResponseEntity<Object> getratinglesser()
	{
		
	List<Employee> employees=employeeService.getEmployeeByByRatingLesser();

	if(employees.size()!=0)
		return new ResponseEntity<Object>(employees,HttpStatus.OK);
	else
		return new ResponseEntity<Object>("Data Not FOund",HttpStatus.OK);		
		
	}
	@GetMapping("ratedept/{dept}")
	public ResponseEntity<Object> getratinganduserdept(@PathVariable String dept)
	{
		
	List<Employee> employees=employeeService.getEmployeeByRatingAndUserdept(dept);

	if(employees.size()!=0)
		return new ResponseEntity<Object>(employees,HttpStatus.OK);
	else
		return new ResponseEntity<Object>("Data Not FOund",HttpStatus.OK);		
		
	}
			
	
}
