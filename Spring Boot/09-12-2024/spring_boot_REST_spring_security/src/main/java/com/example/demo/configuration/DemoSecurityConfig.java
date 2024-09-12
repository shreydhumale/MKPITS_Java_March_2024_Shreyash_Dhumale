package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class DemoSecurityConfig {
	@Bean
	public InMemoryUserDetailsManager userDetailsManager() {
		UserDetails shreyash = User.builder()
				.username("shreyash")
				.password("{noop}123")
				.roles("STUDENT")
				.build();
		
		UserDetails anshul = User.builder()
				.username("anshul")
				.password("{noop}123")
				.roles("STUDENT", "TEACHER")
				.build();
		
		UserDetails rahul = User.builder()
				.username("rahul")
				.password("{noop}123")
				.roles("STUDENT", "TEACHER", "HOD")
				.build();
		return new InMemoryUserDetailsManager(shreyash, anshul, rahul);
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(configure -> 
			configure.requestMatchers(HttpMethod.GET, "/findall").hasRole("TEACHER")
				.requestMatchers(HttpMethod.GET, "/student/**").hasRole("TEACHER")
				.requestMatchers(HttpMethod.POST, "/save").hasRole("TEACHER")
				.requestMatchers(HttpMethod.PUT, "/update").hasRole("TEACHER")
				.requestMatchers(HttpMethod.DELETE, "/delete/**").hasRole("HOD")
				.anyRequest()
				.authenticated());
		http.httpBasic(Customizer.withDefaults());

		http.csrf(csrf -> csrf.disable());
		return http.build();
	}
}
