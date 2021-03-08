package com.lab.ex1.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
		
		Employee empBean = (Employee) context.getBean("emp_details");
		
		empBean.getDetails();
		context.close();
	}

}
