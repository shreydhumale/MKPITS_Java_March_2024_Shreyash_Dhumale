package com.example.service;

import java.util.List;
import com.example.entity.Student;

public interface StudentService {
    void save(Student student);
    Student find(int id);
    List<Student> findAll(); 
}
