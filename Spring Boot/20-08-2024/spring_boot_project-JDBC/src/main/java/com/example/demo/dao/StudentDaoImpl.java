package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import com.example.demo.entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

    private EntityManager entityManager;

    @Autowired
    public StudentDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

	@Override
	public Student findById(int id) {
	 return	entityManager.find(Student.class, id);
	}
}
