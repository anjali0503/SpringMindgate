package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class SpringMain {
	public static void main(String[] args) {
		System.out.println("Main starts!!");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		System.out.println("application ids created!!1");

		Address address = applicationContext.getBean("address", Address.class);
		System.out.println(address);
		
		Employee employee = applicationContext.getBean("employee", Employee.class);
		System.out.println();
		System.out.println(employee);
		
		System.out.println("main ends");

	}
}
