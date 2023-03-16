package com.example.mvc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="company")
public class Company {	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int companyId;
	
	private String companyName;
	
	//@Column(name="company-Address")
	private String companyAddress;
	
	//@Column(name="company-Email")
	private String companyEmail;

}
