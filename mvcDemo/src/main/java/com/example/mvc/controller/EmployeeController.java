package com.example.mvc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mvc.entity.Company;
import com.example.mvc.entity.Employee;
import com.example.mvc.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {
@Autowired
		private EmployeeService employeeService;	
		
		//build create employee REST API
		@PostMapping()
		public Employee save(@RequestBody Employee employee)
		{
			return employeeService.save(employee);
		}
		
		//build find all employee REST API
		@GetMapping
		public List<Employee> getAllEmployee()
		{
			return employeeService.getAllEmployee();
		}
		
		//build find employee by id
		@GetMapping("{id}")
		public Optional<Employee> getEmployeeById(@PathVariable("id") int id){
			return employeeService.getEmployeeById(id);
		}
		
		//build update employee details REST API
		
		@PutMapping("{id}")
		public Employee updateEmployee(@RequestBody Employee employee, Integer id)
		{
			return employeeService.updateEmployee(employee, id);
		}
		
		//build company delete by id
		@DeleteMapping("{id}")
		public void deleteEmployee(@PathVariable("id") int id)
		{
			employeeService.deleteEmployee(id);
		}		
}
