package com.app.repository;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.app.domain.Employee;

import reactor.core.publisher.Mono;
@Repository
public interface EmployeeRepository
		extends  ReactiveMongoRepository<Employee, String> {
Mono<Employee> findByFirstName(String firstName);
Mono<Employee> findByFirstNameAndLastName(String firstName,String lastName);
	

}
