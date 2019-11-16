package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.EmployeeDao;
import com.lti.model.Employee;
@Service("service")
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	private EmployeeDao dao;// = new EmployeeDaoImpl();
	
	@Override
	@Transactional // it indicates this method will participate in the transaction. so all dml 
	public boolean addEmployee(Employee employee) {
		//dao.beginTransaction(); now container will handle the transactions.
		int result = getDao().createEmployee(employee);
		if(result == 1){
			//dao.commitTransaction();
			return true;
		}else{
			//dao.rollbackTransaction();
			return false;
		}
	}
	@Override
	public List<Employee> findAllEmployees() {
		List<Employee> list = getDao().readAllEmployees();
		return list;
	}
	@Override
	@Transactional
	public boolean removeEmployee(int employeeId) {
		//dao.beginTransaction();
		int result = getDao().deleteEmployee(employeeId);
		if(result == 1){
			//dao.commitTransaction();
			return true;
		}else{
			//dao.rollbackTransaction();
			return false;
		}
	}
	@Override
	@Transactional
	public Employee modifyEmployee(Employee employee) {
		//dao.beginTransaction();
		Employee employee2 = getDao().updateEmployee(employee);
		//dao.commitTransaction();
		return employee2;
	}
	public EmployeeDao getDao() {
		return dao;
	}
	public void setDao(EmployeeDao dao) {
		System.out.println("setDao");
		this.dao = dao;
	}
}
