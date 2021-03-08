package com.lab.ex3.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
		
		SBU sbu = (SBU) context.getBean("emp_sbu_details1");
		
		System.out.println(sbu.getEmpList());
		
		context.close();
	}

}
