package com.example.demo.dao;
import com.example.demo.entity.Student;

public interface StudentDao {
	void save(Student student);
	
	Student findById(int id);
	
	void deleteByID(int id);
	
	void update(int id);
}
