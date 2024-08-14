package com.example.demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CurrentAccount implements Account{

	public CurrentAccount(){
		System.out.println("current account constructor called");
	}
	@Override
	public String getDetails() {
		return "details of current account";
	}

}
