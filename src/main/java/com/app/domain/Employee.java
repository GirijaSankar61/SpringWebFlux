package com.app.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
@Document
@Data
@ToString
@Builder
public class Employee {
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private Address homeAddress;
	private Address officeAddress;

}
