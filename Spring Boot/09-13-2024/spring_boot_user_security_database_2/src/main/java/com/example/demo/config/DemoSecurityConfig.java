package com.example.demo.config;

import java.text.Normalizer.Form;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class DemoSecurityConfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(configure -> configure.requestMatchers(HttpMethod.GET, "/students")
				.hasRole("TEACHER")
				.requestMatchers(HttpMethod.GET, "/students/**").hasRole("MANAGER")
				.requestMatchers(HttpMethod.POST, "/students").hasRole("MANAGER")
				.requestMatchers(HttpMethod.PUT, "/students").hasRole("ADMIN")
				.requestMatchers(HttpMethod.DELETE, "/students/**").hasRole("ADMIN")
				.anyRequest()
				.authenticated()
				).formLogin(form -> form
						.loginPage("/ShowloginPage")
						.loginProcessingUrl("/authenticateTheUser")
						.permitAll())
						.logout(logout -> logout.permitAll())	;
		
		http.httpBasic(Customizer.withDefaults());

		http.csrf(csrf -> csrf.disable());
		return http.build();
	}
	
	@Bean
	public UserDetailsManager userDetailsManager(DataSource dataSource) {
		return new JdbcUserDetailsManager(dataSource);
	}

}