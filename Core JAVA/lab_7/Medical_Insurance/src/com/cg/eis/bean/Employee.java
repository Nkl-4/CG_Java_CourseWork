package com.cg.eis.bean;

public class Employee {
	private int id ;
	private String name;
	private int salary;
	private String designation;
	private String insuranceScheme;
	
	
	public Employee() {
		super();
	}
	
	public Employee(int id, String name, int salary, String designation, String insuranceScheme) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
		//this.setInsuranceSchemeInternal(this.salary, this.designation);
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	
/*	private void setInsuranceSchemeInternal(int sal, String desig) {
		if((sal > 5_000 && sal < 20_000) && desig == "System Associate") {
			this.insuranceScheme = "Scheme C";
		}
		
		if((sal >= 20_000 && sal < 40_000) && desig == "Programmer") {
			this.insuranceScheme = "Scheme B";
		}
		
		if(sal >= 40_000 && desig == "Manager") {
			this.insuranceScheme = "Scheme A";
		}
		
		if(sal < 5_000 && desig == "Clerk") {
			this.insuranceScheme = "No Scheme";
		}
		
		else {
			this.insuranceScheme = "Undefined";
		}
		
		
	}
*/
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}
	
	
	
}
