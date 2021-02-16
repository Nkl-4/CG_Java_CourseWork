package com.cg.eis.exception;

public class EmployeeException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int salary;
	public EmployeeException(int salary) {
		this.salary = salary; 
	}
	
	public String toString() {
		return "Alert! Your salary " + this.salary + " is lower than 3000";
	}
}
