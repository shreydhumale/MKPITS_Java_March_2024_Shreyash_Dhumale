package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dao.StudentDao;
import com.example.entity.Student;
import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService {

    private  StudentDao studentDao;

    @Autowired
    public StudentServiceImplementation(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public void save(Student student) {
        studentDao.save(student);
    }

    @Override
    public Student find(int id) {
        return studentDao.find(id);
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();  
    }
}
