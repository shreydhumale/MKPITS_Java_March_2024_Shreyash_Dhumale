package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentServiceImpl;

@RestController
public class StudentController {
	StudentServiceImpl service;

	public StudentController(StudentServiceImpl service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/findall")
	public List<Student>findAll(){
		List<Student>list=service.findAll();
		return list;
	}
	
	@PostMapping("/save")
	public void saveStudent(@RequestBody Student student) {
		service.save(student);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteStudent(@PathVariable int id) {
		service.delete(id);
	}
	
	@GetMapping("/student/{id}")
	public Student findByIdStudent(@PathVariable int id) {
		return service.findById(id);
	}
	
	@PutMapping("/update/{id}")
	public void updateStudent(@PathVariable int id, @RequestBody Student student) {
		student.setSid(id);
		service.updateStudent(student);
	}
	
}
