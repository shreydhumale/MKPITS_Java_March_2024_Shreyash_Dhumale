package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentDao {
	public List<Student> students();

	public void save(Student student);
	
	public void delete(int id);
	
	public Student findByID(int id);
}
