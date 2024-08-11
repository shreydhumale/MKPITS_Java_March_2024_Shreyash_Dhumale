package com.java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
	Student student = (Student) context.getBean("stud");
	student.display();
	}
}
