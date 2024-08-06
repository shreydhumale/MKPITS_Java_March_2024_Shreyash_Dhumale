package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Student student = (Student) context.getBean("s");
        	
        System.out.println("Name: " + student.getName());
        System.out.println("City: " + student.getCity());
    }
}
