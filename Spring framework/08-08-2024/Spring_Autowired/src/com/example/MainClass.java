package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
		Student student=(Student)context.getBean("s1",Student.class);
		System.out.println(student.getName());
		
		Address address=(Address)context.getBean("address",Address.class);
		System.out.println(address.getAddress());
	}
}
