package com.example.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mvc.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
