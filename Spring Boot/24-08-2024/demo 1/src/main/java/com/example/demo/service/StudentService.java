package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
	public List<Student>listOfStudents();
	
	public void savestudent(Student student);
	
	public void deleteStudent(int id);
	
	public Student findById(int id);
	
}
