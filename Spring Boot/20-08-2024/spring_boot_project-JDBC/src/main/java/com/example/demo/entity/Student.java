package com.example.demo.entity;

import org.hibernate.annotations.GeneratedColumn;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //to map with database
@Table(name = "student")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
	@Id
	@GeneratedValue
	private int id;
	private String firstname;
	private String lastname;
	private String email;
}
