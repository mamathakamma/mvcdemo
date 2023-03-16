package com.example.mvc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//@Column(name="empId", nullable = false)
	private int empId;
	
	private String firstName;
	
	private String lastName;
	
	private String emailId;
	
	private String address;
	
}
/*
		"firstName":"abc",
		"lastName":"abc",
		"emailId":"abc@gmail.com",
		"Address":"hsr"
*/



