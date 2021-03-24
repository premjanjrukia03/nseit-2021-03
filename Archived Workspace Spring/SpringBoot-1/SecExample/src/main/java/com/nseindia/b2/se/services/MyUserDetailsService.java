package com.nseindia.b2.se.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nseindia.b2.se.models.MyUserDetails;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// I am supposed to write a code that finds a userdetails that has the same username as the username parameter
		// and I need to return that user as a UserDetails object
		// If I do not find a user then it should throw UserNameNotFoundException
		if (!username.equals("ghost")) {
			throw new UsernameNotFoundException("User not ghost");		
		}
		
		MyUserDetails myUserDetails = new MyUserDetails("ghost","$2a$10$jhuiNCHIQz0dqV3m4HYKdeNDcNcPHO3ioJv03DvkKU7Rja29zaRpi");
		Set<GrantedAuthority> gaList = new HashSet<GrantedAuthority>();
		
		// YOu have to type ROLL_ before the roll name
		gaList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		gaList.add(new SimpleGrantedAuthority("ROLE_USER"));
		
		
		
		myUserDetails.setAuthorities(gaList);
		
		return myUserDetails;
	}

}


// Authentication
// user=ghost, password = password
// uds.loadUserByUsername returns an Object of UserDetailsService
// 