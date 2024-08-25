package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;
import com.example.demo.exception.StudentNotFoundException;

import jakarta.transaction.Transactional;

@Service
public class ImplementServices implements StudentService{

	@Autowired
	private StudentDao studentDao;
	
	public ImplementServices(StudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}

	@Override
	public List<Student> listOfStudents() {
		List<Student>list= studentDao.students();
		return list;			
	}

	@Override
	@Transactional
	public void savestudent(Student student) {
		studentDao.save(student);
	}

	@Override
	public void deleteStudent(int id) {
		studentDao.delete(id);
	}

	@Override
	public Student findById(int id) {
		Student student=studentDao.findByID(id);
	
		return student;
	}

	@Override
	public void update(int id, String firstname, String lastname) {
		studentDao.update(id, firstname, lastname);
	}
}
