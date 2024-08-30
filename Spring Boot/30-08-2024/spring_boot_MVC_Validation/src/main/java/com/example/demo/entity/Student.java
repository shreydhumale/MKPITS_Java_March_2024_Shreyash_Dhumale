package com.example.demo.entity;

import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Student {
	@NotNull(message = "first name required")
	@Size(min=1, message = "first name is required")
	private String firstName;
	
	@NotNull(message = "last name required")
	@Size(min=1, message = "last name is required")
	private String lastName;
	private String city;
	private String favoriteSubject;
	private List<String> favouriteLangauge;
	
	public Student() {
		
	}

	public Student(String firstName, String lastName, String city, String favoriteSubject,
			List<String> favouriteLangauge) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.favoriteSubject = favoriteSubject;
		this.favouriteLangauge = favouriteLangauge;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getFavoriteSubject() {
		return favoriteSubject;
	}

	public void setFavoriteSubject(String favoriteSubject) {
		this.favoriteSubject = favoriteSubject;
	}
	

	public List<String> getFavouriteLangauge() {
		return favouriteLangauge;
	}

	public void setFavouriteLangauge(List<String> favouriteLangauge) {
		this.favouriteLangauge = favouriteLangauge;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", favoriteSubject="
				+ favoriteSubject + "]";
	}	
}
