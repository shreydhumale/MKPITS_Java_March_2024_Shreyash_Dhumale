package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {
	
	public Student save(Student s);
	public List<Student>findAll();
	public Student findById(int id);
	public void updateStudent(Student student);
	public void delete(int id);
	
}
