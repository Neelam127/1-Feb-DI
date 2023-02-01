package com.cg1.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("employeeconfig.xml");
		Employee emp=(Employee) context.getBean("employee");
		System.out.println(emp.getCourses());
		System.out.println(emp.getAddress());
		System.out.println(emp.getPhones());
		
		context.registerShutdownHook();
	}

}
