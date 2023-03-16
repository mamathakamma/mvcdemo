package com.example.mvc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mvc.entity.Company;
import com.example.mvc.service.CompanyService;

import lombok.Data;
@Data
@RestController
@RequestMapping("company")
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;

	//build create company REST AP
	@PostMapping
	public ResponseEntity<Company> save(@RequestBody Company company)
	{
		return new ResponseEntity<Company>(companyService.save(company), HttpStatus.CREATED);
	}
	//build get all companies REST API
	@GetMapping
	public List<Company> getAllCompany()
	{
		return companyService.getAllCompany();
	}
	//build get company by Id Rest Api
	@GetMapping("{id}")
	public Optional<Company> getCompanyById(@PathVariable("id") int id){
		return companyService.getCompanyById(id);
	}
	//build update company Rest Api
	@PutMapping("{id}")
	public Company updateCompany(@RequestBody Company company, Integer id)
	{
		return companyService.updateCompany(company, id);
	}
	//build company delete by id
	@DeleteMapping("{id}")
	public void deleteCompany(@PathVariable("id") int id)
	{
		companyService.deleteCompany(id);
	}
	
}

/*
	"companyId":"1",
	"companyName":"abc",
	"companyAddress":"hsr",
	"companyEmail":"abc@gmail.com"
	
	"companyId":"2",
	"companyName":"mno",
	"companyAddress":"btm",
	"companyEmail":"mno@gmail.com"
	
	"companyId":"3",
	"companyName":"xyz",
	"companyAddress":"knl",
	"companyEmail":"xyz@gmail.com"

*/
