package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.model.Employee;
import com.lti.service.EmployeeService;

@RestController
@RequestMapping(path="employees")
@CrossOrigin
public class EmployeeRestController {
	@Autowired
	private EmployeeService service; 
	
	// http://localhost:9091/employees
	@RequestMapping(method = RequestMethod.GET)
	public List<Employee> viewAllEmployees(){
	     return service.findAllEmployees();	
	}
	
	// http://localhost:9091/employees/1
	@RequestMapping(path="{empId}", method = RequestMethod.GET)
	public Employee viewEmployeeById(@PathVariable("empId") int employeeId)
	{
		return service.findEmployeeById(employeeId);
	}
	
	// http://localhost:9091/employees/1
	@RequestMapping(path="{empId}",method=RequestMethod.DELETE)
	public List<Employee> deleteEmployee(@PathVariable("empId") int employeeId)
	{
		boolean result = service.removeEmployee(employeeId);
		return service.findAllEmployees();
	}
	
	// http://localhost:9091/employees
	@RequestMapping(method=RequestMethod.POST)
	// json formatted data will be translated into object and read by @RequestBody
	public List<Employee> addEmplyoee(@RequestBody Employee employee)
	{
		boolean result = service.addEmployee(employee);
		return service.findAllEmployees();

	}
	
	// http://localhost:9091/employees
	@RequestMapping(method=RequestMethod.PUT)
	public List<Employee> updateEmployee(@RequestBody Employee employee)
	{
		Employee result = service.modifyEmployee(employee);
		return service.findAllEmployees();

	}

}
