package com.example.EmployeeSystem.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.EmployeeSystem.model.Employee;

@Repository
public interface EmployeeDAO extends CrudRepository<Employee, Integer> {

//	get employee details by using name
	public List<Employee> findByname(String name);
	
//	get employee details by using dept
	public List<Employee> findBydept(String name);
		
	public List<Employee> findByDeptAndCity(String dept,String city);	
	
	public List<Employee> findByqualification(String qualification);
	
	@Query("select e from Employee e where e.rating>4")
	public List<Employee> findByRating(int rating);
	
	@Query("select e from Employee e where e.rating>4 AND e.qualification=('pg')")
	public List<Employee> findByRatingAndQualification(int rating, String qualification);
	
	@Query("select e from Employee e where e.rating>4 AND e.city=:city")
	public List<Employee> findByRatingAndCity(@Param("city") String city);
	
	@Query("select e from Employee e where e.rating<3 AND e.dept=('IT')")
	public List<Employee> findByRatingAndDept();
	
	@Query("select e from Employee e where e.rating<3")
	public List<Employee> findByRatingLesser();
	
	@Query("select e from Employee e where e.rating<3 AND e.dept=:dept")
	public List<Employee> findByRatingAndUserdept(@Param("dept") String dept);
	
}
