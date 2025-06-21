package com.example.EmployeeSystem.exception;


public class UserAlreadyRegisteredException extends Exception{	
	
	public UserAlreadyRegisteredException() {
	super("user already exist");
	}
}
