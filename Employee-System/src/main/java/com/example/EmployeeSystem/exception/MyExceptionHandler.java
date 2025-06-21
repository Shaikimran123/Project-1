package com.example.EmployeeSystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Component
@ControllerAdvice
public class MyExceptionHandler {

	@ExceptionHandler(UserAlreadyRegisteredException.class)
	public ResponseEntity<String> employeeRegisteredHandler(){
		return new ResponseEntity<String>("Employee with the given author id already registered",HttpStatus.NOT_ACCEPTABLE);
	}
	
	@ExceptionHandler(UserIdNotFound.class)
	public ResponseEntity<String> employeeIdHandler(){
		return new ResponseEntity<String>("Employee with the given id cant ne deleted",HttpStatus.NOT_ACCEPTABLE);
	}
}
