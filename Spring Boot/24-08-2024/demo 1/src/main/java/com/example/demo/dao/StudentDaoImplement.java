package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.*;

@Repository
public class StudentDaoImplement implements StudentDao{
	
	private EntityManager entityManager;
	
	@Autowired
	public StudentDaoImplement(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}


	@Override
	public List<Student> students() {
		Query query = entityManager.createQuery("SELECT firstname, lastname ,id FROM Student");
	List<Student> list	=query.getResultList();
	
	return list;
	}


	@Override
	public void save(Student student) {
		entityManager.persist(student);
	}


	@Override
	public void delete(int id) {
		entityManager.remove(id);
	}


	@Override
	public Student findByID(int id) {
		Student student=entityManager.find(Student.class, id);
		return student;
	}

}
