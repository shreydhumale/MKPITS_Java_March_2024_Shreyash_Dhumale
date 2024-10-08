package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

//@RestController
//@Autowired
//@Component
//@GetMapping
//@Qualifier
//@Lazy
//@PostConstruct
//@PreDestroy


@RestController
public class DemoController {
	
	private Account account;
	
	//setter injection
	@Autowired
	public void setAccount(@Qualifier("loanAccount") Account account) {
		this.account = account;
	}

	//constructor injection
	@Autowired
	public DemoController(@Qualifier("currentAccount") Account account) {
		this.account=account;
	}
	
	@GetMapping("/details")
	public String getDetails() {
		return account.getDetails();
	}
	
	//bean lifecycle annotations
	
	@PostConstruct
	public void postConstructor() {
		System.out.println("Post Constructor method called");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("Pre destroy method called");
	}
}
