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
        entityManager.persist(student);//stores the object to database
    }

	@Override
	public Student findById(int id) {
	 return	entityManager.find(Student.class, id);
	}

	@Override
	@Transactional
	public void deleteByID(int id) {
	    Student student = entityManager.find(Student.class, id);
	    entityManager.remove(student);
	}

	@Override
	@Transactional
	public void update(int id) {
		Student student2 = entityManager.find(Student.class, id);
		
		entityManager.merge(id);
	}
}
