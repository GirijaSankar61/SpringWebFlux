package com.app.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Document
@Data
@ToString
@Builder
public class Address {
	private String addressLine1;
	private String addressline2;
	private String state;
	private String country;
	private int pinCode;
	

}
