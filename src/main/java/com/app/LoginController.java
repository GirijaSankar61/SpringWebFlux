package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.domain.Employee;
import com.app.service.EmployeeService;

import reactor.core.publisher.Flux;

@RestController
public class LoginController {
	@Autowired
	private EmployeeService employeeService;
	@Value(value="${appname}")
	private String applicationName;
	
	@GetMapping("/")
    public String helloHandler () {
//		Employee emp=new Employee();
////		emp.setN
		
        return "<h1>Hello "+applicationName+"</h1>";
    }
	@GetMapping("/all")
    public Flux<Employee> findAllEmployees () {
        return employeeService.findAllEmployee().defaultIfEmpty(new Employee());
    }
	

}
