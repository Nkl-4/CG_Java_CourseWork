package com.cg.eis.service;

import java.util.HashMap;
import java.util.Map;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements IEmployeeService {
	
	HashMap<Integer,Employee> employees;
	
	@Override
	public void addEmployee(Employee emp) {
		employees.put(emp.getId(), emp);
	}

	@Override
	public void deleteEmployee(int empId) {
		employees.remove(empId);
	}

	public Map<Integer, Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(HashMap<Integer, Employee> employees) {
		this.employees = employees;
	}


}
