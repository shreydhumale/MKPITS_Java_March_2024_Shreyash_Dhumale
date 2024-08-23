package com.example.dao;

import java.util.List;
import com.example.entity.Student;

public interface StudentDao {
    void save(Student student);
    List<Student> findAll(); 
    Student find(int id);
}
