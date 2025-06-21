package com.example.EmployeeSystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
@Id
 private int empId;
private String name;
private String dept;
private String city;
private String qualification ; //ugs grads/post grads 
 private char gender;  //f,m
private int rating;

public Employee() {
	// TODO Auto-generated constructor stub
}

public Employee(int empId, String name, String dept, String city, String qualification, char gender, int rating) {
	super();
	this.empId = empId;
	this.name = name;
	this.dept = dept;
	this.city = city;
	this.qualification = qualification;
	this.gender = gender;
	this.rating = rating;
}

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getQualification() {
	return qualification;
}

public void setQualification(String qualification) {
	this.qualification = qualification;
}

public char getGender() {
	return gender;
}

public void setGender(char gender) {
	this.gender = gender;
}

public int getRating() {
	return rating;
}

public void setRating(int rating) {
	this.rating = rating;
}

@Override
public String toString() {
	return "Employee [empId=" + empId + ", name=" + name + ", dept=" + dept + ", city=" + city + ", qualification="
			+ qualification + ", gender=" + gender + ", rating=" + rating + "]";
}




}
