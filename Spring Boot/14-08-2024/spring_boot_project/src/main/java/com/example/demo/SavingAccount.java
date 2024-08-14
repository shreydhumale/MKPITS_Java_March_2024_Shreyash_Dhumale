package com.example.demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class SavingAccount implements Account{
	

	public SavingAccount() {
		System.out.println("saving account constructor called");
	}

	@Override
	public String getDetails() {
		return "deatils of saving account";
	}
	
}
