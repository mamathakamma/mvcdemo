package com.example.mvc.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mvc.entity.Company;
import com.example.mvc.entity.Employee;
import com.example.mvc.repository.EmployeeRepository;
import com.example.mvc.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee save(Employee employee) 
	{
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeRepository.findAll();
	}

	public Optional<Employee> getEmployeeById(int id) {
		return employeeRepository.findById(id);
	}
	

	public Employee updateEmployee(Employee employee, Integer id) {
		employee.setFirstName(employee.getFirstName());
		employee.setLastName(employee.getLastName());
		employee.setAddress(employee.getAddress());
		employee.setEmailId(employee.getEmailId());
		employeeRepository.save(employee);
		return employee;
	}

	@Override
	public void deleteEmployee(Integer id) {
		employeeRepository.deleteById(id);
		
		
	}
}
