package com.lti.dao;

import java.util.List;

import com.lti.model.Employee;

public interface EmployeeDao {
	public int createEmployee(Employee employee);
	public List<Employee> readAllEmployees();
	public int deleteEmployee(int employeeId);
	public Employee updateEmployee(Employee employee);
	public Employee readEmployeeById(int employeeId);
	
}
