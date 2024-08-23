package com.example.dao;

import java.util.List;
import com.example.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

public class StudentDaoImplementation implements StudentDao {

    private final EntityManager entityManager;

    public StudentDaoImplementation(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> query = entityManager.createQuery("SELECT s FROM Student s", Student.class);
        List<Student> students = query.getResultList();
        System.out.println("Students: " + students); 
        return students;
    }

    
    @Override
    public Student find(int id) {
        return entityManager.find(Student.class, id);
    }
}