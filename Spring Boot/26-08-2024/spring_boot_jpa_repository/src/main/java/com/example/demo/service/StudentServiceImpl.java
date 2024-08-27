package com.example.demo.service;

import java.util.List;

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

	//create
	@Override
	public Student save(Student s) {
		return sd.save(s);
	}


	//retrive
	@Override
	public List<Student> findAll() {
		List<Student>students=sd.findAll();
		return students;
	}

	//retrive
	@Override
	public Student findById(int id) {
		Student student=sd.findById(id).orElse(null);
		return student;
	}

	//update
	@Override
	public void updateStudent(Student student) {
		int id=student.getSid();
		
		Student student2=findById(id);
		
		if(student2 != null) {
			student2.setSname(student.getSname());
			student2.setScity(student.getScity());
			student2.setSpercentage(student.getSpercentage());
			sd.save(student2);
		}
	}
	
	//delete
	@Override
	public void delete(int id) {
		sd.deleteById(id);
	}
}
