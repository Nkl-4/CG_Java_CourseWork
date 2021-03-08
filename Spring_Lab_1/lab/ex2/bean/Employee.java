package com.lab.ex2.bean;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private String bu;
	private int age;
	
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getBu() {
		return bu;
	}
	public void setBu(String bu) {
		this.bu = bu;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void getDetails(SBU sbu) {
		System.out.println("Employee details");
		System.out.println("---------------------------------");
		System.out.print(String.format("Employee [empAge=%d, empId=%d, empName=%s, empSalary=%f\nsbu details=SBU [", this.age,this.id,this.name,this.salary));
		this.getSbuDetails(sbu);
	}
	
	public void getSbuDetails(SBU sbu) {
		System.out.println(sbu.toString()+"]]");		
	}
	
	
}
