package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;

@RestController
@RequestMapping(value = "/main", method = RequestMethod.GET)
public class MyController {
//	@Value("${company.name}")
//	private String company;
//	@GetMapping("/hello")
//	public String sayHello() { 
//		return "Hello"+" "+company;
//	}
//	
//	@Value("${name}") 
//	private String name;
//	@GetMapping("/name")
//	public String myName() {
//		return name;
//	}
//	
//	@GetMapping("/student")
//	public Student getStudent() {
//		return new Student(101,"Shreyash","Amravati");
//	}
		
	List<Student>students;
	
	public MyController() {
		students=new ArrayList<>();
	}
	
	@GetMapping("/create")
	public Student createStudent(@RequestParam(name ="id")Integer id,@RequestParam(name="name")String name,@RequestParam(name="city")String city ){
		Student student = new Student(id,name,city	);
		students.add(student);
		return student;
	}
	
	//to search a student by id 

	@GetMapping("/id/{id}")
	public Student searchStudent(@PathVariable int id) {
		Iterator iterator = students.iterator();
		
	
		while(iterator.hasNext()) {
			Student student =(Student) iterator.next();
			if(student.getId()== id) {
				return student;
			}
		}
		return null;
	}
	
	//to search a student by id using stream api
	@GetMapping("/search/{id}")
	public Student getStudent(@PathVariable("id") int id) {
		
		return students.stream().filter(
					s -> {
						return s.getId()== id; 
					}
				).findAny().get();
	} 

	

	@GetMapping("/students")
	public List<Student> students(){
		List<Student> students = new ArrayList<>();
		Student student1 = new Student(102,"Anshul","Amravati");
		students.add(student1);
		
		Student student2 = new Student(103,"Yash","Pune");
		students.add(student2);
		
		Student student3 = new Student(104,"Rahul","Bangalore");
		students.add(student3);
		
		Student student4 = new Student(105,"Raj","Chennai");
		students.add(student4);
		
		return students;
	}
}
