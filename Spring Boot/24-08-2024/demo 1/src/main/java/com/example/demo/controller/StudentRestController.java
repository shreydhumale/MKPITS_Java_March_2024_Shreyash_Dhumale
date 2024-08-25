package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.exception.StudentErrorResponse;
import com.example.demo.exception.StudentNotFoundException;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	
	private StudentService service;

	@Autowired
	public StudentRestController(StudentService service) {
		this.service = service;
	}
	
	@GetMapping("/s")
	public List<Student>  getAllStudents(){
		List<Student>list=service.listOfStudents();
		return list;
	}
	
	@PostMapping("/poststudents")
	public Student saveStudent(@RequestBody Student student)
	
	{
		service.savestudent(student);
		
		return student;
	}
	
	@DeleteMapping("/delete")
	public void deleteStudent(Student student) {
		service.deleteStudent(10);
	}
	
	@PutMapping("/update")
	public  void updateStudent(@RequestParam(name = "id")int id,
			@RequestParam(name = "firstname")String firstname,
			@RequestParam(name = "lastname")String lastname) {
			
		service.update(id, firstname, lastname);
	}
	
	@GetMapping("/find/{id}")
	public Student getStudent(@PathVariable int id) {
	    Student student = service.findById(id);
	    if (student == null) {
	    	throw new StudentNotFoundException("Student not found");
	    }
	    return student;
	    
//	    if(id >=10) {
//	    	throw new StudentNotFoundException("Student not found");
//	    }
//	    return student;
	}
	
//	@ExceptionHandler
//	public ResponseEntity<StudentErrorResponse>handlerResponseEntity(StudentNotFoundException e){
//		 StudentErrorResponse studentErrorResponse=new StudentErrorResponse();
//		 studentErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
//		 studentErrorResponse.setMessage(e.getMessage());
//		 studentErrorResponse.setTimestamp(System.currentTimeMillis());
//		 
//		 return new ResponseEntity<>(studentErrorResponse,HttpStatus.NOT_FOUND);
//	}
}
