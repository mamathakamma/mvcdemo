package com.example.mvc.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mvc.entity.Company;
import com.example.mvc.repository.CompanyRepository;
import com.example.mvc.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	private CompanyRepository companyRepository;
	
	@Override
	public Company save(Company company) {
		return companyRepository.save(company) ;
	}
	@Override
	public List<Company> getAllCompany() {
		
		return companyRepository.findAll();
	}

	public Optional<Company> getCompanyById(int id) {
		return companyRepository.findById(id);
	}
	@Override	
	public Company updateCompany(Company company, Integer id) {
		company.setCompanyName(company.getCompanyName());
		company.setCompanyAddress(company.getCompanyAddress());
		company.setCompanyEmail(company.getCompanyEmail());
		companyRepository.save(company);
		return company;
	}
	@Override
	public void deleteCompany(Integer id) {
		companyRepository.deleteById(id);
		
		
	}
		

}
