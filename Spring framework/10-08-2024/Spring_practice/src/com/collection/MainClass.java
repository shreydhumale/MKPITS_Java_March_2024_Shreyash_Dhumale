package com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
		Student student=(Student)context.getBean("list");
		student.display();
	}
}
