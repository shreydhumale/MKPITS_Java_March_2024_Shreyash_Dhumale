package com.practice;

public class Hobby {
	private String hobby;

	public Hobby(){
		
	}
	
	public Hobby(String hobby) {
		this.hobby=hobby;
	}
	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Hobby [hobby=" + hobby + "]";
	}
	
	
}
