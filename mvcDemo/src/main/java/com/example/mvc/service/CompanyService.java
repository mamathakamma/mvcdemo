package com.example.mvc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.mvc.entity.Company;

@Service
public interface CompanyService {
		
	Company save(Company company);
	
	List<Company> getAllCompany();
	
	Optional<Company> getCompanyById(int id);
	
	Company updateCompany(Company company, Integer id);
	
	void deleteCompany(Integer id);
}
