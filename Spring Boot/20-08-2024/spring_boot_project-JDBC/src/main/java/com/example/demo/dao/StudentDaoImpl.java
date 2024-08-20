package com.example.demo.dao;

import com.example.demo.entity.Student;

import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class StudentDaoImpl implements StudentDao{
	
	private EntityManager entityManager;

	@Override
	public void save(Student student) {
		entityManager.persist(student);
	}

}
