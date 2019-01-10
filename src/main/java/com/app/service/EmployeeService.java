package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.domain.Employee;
import com.app.repository.EmployeeRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Mono<Employee> saveEmployee(Employee employee){
		return employeeRepository.save(employee);
	}
	
	public Mono<Employee> findEmployeeByFirstName(String firstName){
		return employeeRepository.findByFirstName(firstName);
	}
	public Mono<Employee> findEmployeeByFirstNameAndLastName(String firstName,String lastName){
		return employeeRepository.findByFirstNameAndLastName(firstName,lastName);
	}
	
	public Flux<Employee> findAllEmployee() {
		return employeeRepository.findAll();
	}
	
	

}
