package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName="prototype")
@Entity
@Table(name="emp")
// used when we have to use this query for more number of times, we dont have to write this query in each method.
@NamedQuery(name="DELETE_BY_EMPID",query="Delete From Employee e Where e.employeeId=:eid")
public class Employee {
	@Id
	@Column(name="EMP_ID")
	private int employeeId;
	
	@Column(name="EMP_NAME")
	private String employeeName;
	
	@Column(name="EMP_SAL")
	private double employeeSalary;

	public Employee(){
		System.out.println("Object of Employee created.");
	}
	public Employee(int employeeId, String employeeName, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
}
