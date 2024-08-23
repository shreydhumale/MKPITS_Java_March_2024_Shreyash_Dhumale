package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.Student;
import com.example.service.StudentService;
import java.util.List;

@RestController
@RequestMapping("/main")
public class StudentRestController {

    private final StudentService service;

    @Autowired
    public StudentRestController(StudentService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public Student createStudent(@RequestParam(name = "id") Integer id,
                                 @RequestParam(name = "firstName") String firstName,
                                 @RequestParam(name = "lastName") String lastName,
                                 @RequestParam(name = "email") String email) {
        Student student = new Student(id, firstName, lastName, email);
        service.save(student);
        return student;
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return service.findAll();
    }
}
