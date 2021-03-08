package com.lab.ex2.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
		
		Employee empBean = (Employee) context.getBean("emp_details1");
		SBU sbu = (SBU) context.getBean("emp_sbu_details");
		
		empBean.getDetails(sbu);
		
		context.close();
	}

}
