package com.example.demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LoanAccount implements Account {

	public LoanAccount() {
		System.out.println("loan account constructor called");
	}
	@Override
	public String getDetails() {
		return "details of loan account";
	}

}
