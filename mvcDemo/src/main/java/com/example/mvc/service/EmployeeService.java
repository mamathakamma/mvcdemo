package com.example.mvc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.mvc.entity.Company;
import com.example.mvc.entity.Employee;

@Service
public interface EmployeeService {
	
	Employee save(Employee employee);
	
	List<Employee> getAllEmployee();
	
	Optional<Employee> getEmployeeById(int id);
	
	Employee updateEmployee(Employee employee, Integer id);
	
	void deleteEmployee(Integer id);
	
}
