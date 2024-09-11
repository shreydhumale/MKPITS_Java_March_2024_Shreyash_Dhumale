package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class UserConfig {

	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails shreyash = User
				.builder().
				username("shreyash").
				password("{noop}123").
				roles("employee").build();

		UserDetails anshul = User
				.builder()
				.username("anshul")
				.password("{noop}321")
				.roles("employee", "manager").build();

		UserDetails rahul = User
				.builder().username("rahul")
				.password("{noop}121")
				.roles("employee", "manager", "admin").build();

		return new InMemoryUserDetailsManager(shreyash, anshul, rahul);
	}
	
	@Bean
	public  SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws  Exception
	{
		httpSecurity.authorizeHttpRequests(
				configure->configure.requestMatchers("/login").permitAll()
						.requestMatchers(HttpMethod.GET,"/employee").hasRole("employee")
						.requestMatchers(HttpMethod.GET,"/manager").hasRole("manager")
						.requestMatchers(HttpMethod.GET,"/admin").hasRole("admin")
						.anyRequest().authenticated()
		);

		httpSecurity.httpBasic(Customizer.withDefaults());

		return httpSecurity.build();

	}
	
}
