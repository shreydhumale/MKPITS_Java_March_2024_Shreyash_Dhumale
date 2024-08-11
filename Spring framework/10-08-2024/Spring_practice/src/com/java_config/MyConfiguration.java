package com.java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
	
	@Bean
	public Student stud() {
		Student student=new Student();
		student.setName("Yash");
		student.setCity("Pune");
		student.setMarks(90);
		return student;
	}
}
