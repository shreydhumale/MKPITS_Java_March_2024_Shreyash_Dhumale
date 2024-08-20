package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //to map with database
@Data
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; 
    private String firstname;
    private String lastname;
    private String email;

    public Student() {}
    
    public Student(String firstname, String lastname, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        
        
    }

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + "]";
	}
}
