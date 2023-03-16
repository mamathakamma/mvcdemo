package com.example.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mvc.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer>{

}
