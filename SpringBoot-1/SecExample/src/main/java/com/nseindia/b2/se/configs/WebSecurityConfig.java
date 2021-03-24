package com.nseindia.b2.se.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.nseindia.b2.se.services.MyUserDetailsService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	MyUserDetailsService uds;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(uds);	
		} // Authentication config

	// Blowfish block cipher is the algorithm used by this encoder
	// If you want SHA-1 or md5 use an encoder which implements that
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	// Authorizing HTTP request
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// We are supposed to modify this http object
		// to inform spring security the authorization rules that we have.
		
		// This means that we will be using a form to login, and the loginPage is at /login
		http
			.authorizeRequests()
				.antMatchers("/").permitAll()
				.antMatchers("/secureURL").authenticated()
				.antMatchers("/admin").hasAnyRole("ADMIN")
				.antMatchers(HttpMethod.GET,"/insecureURL").permitAll()
				.antMatchers(HttpMethod.POST, "/insecureURL").authenticated()
		.and()
			.formLogin();
		// FormLogin creates a login page if there does not exist a page at /login
		
	} // AUthorization config

}
