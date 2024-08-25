package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;

import jakarta.transaction.Transactional;

@Service 	
@Transactional
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao sd;

	@Override
	public Student save(Student s) {
		return sd.save(s);
	}
	
}
