package com.example.demo;

import javax.swing.plaf.synth.SynthScrollPaneUI;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;

@SpringBootApplication
public class SpringBootProject1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootProject1Application.class, args);
    }
    
    @Bean
    public CommandLineRunner commandLineRunner(StudentDao studentDao) {
        return runner -> {
        	
        	//to insert a student
//            Student student = new Student("Rahul", "Kelkar", "rahul@gmail.com");
//            studentDao.save(student);
//            
//        	//to find a student
//            Student student2 = studentDao.findById(4);
//            System.out.println(student2);
//        	
//        	//to delete a student
//        	studentDao.deleteByID(10);
//        	studentDao.deleteByID(11);
//        	studentDao.deleteByID(12);
        	
        	//to update student
        	
        	createStudent(studentDao);
        	findStudent(studentDao, 2);
        };
    }
    
    public void createStudent(StudentDao studentDao) {
    	Student student = new Student("Soumya", "Deshmukh", "soumya@gmail.com");
    }
    
    public void findStudent(StudentDao studentDao, int id) {
    	Student student= studentDao.findById(2);
    	System.out.println(student);
    }
    
    public void update(StudentDao studentDao,int id) {
    	
    }
}

