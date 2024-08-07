package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        
        Student student = (Student) context.getBean(Student.class);
        	
        System.out.println("Name: " + student.getName());
        System.out.println("City: " + student.getCity());
    }
}