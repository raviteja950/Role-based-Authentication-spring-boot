package com.security.Authentication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.security.Authentication.entity.User;
import com.security.Authentication.repository.Authenticationrepo;

@Service
public class cusUserDetailsService implements UserDetailsService {

	@Autowired
	private Authenticationrepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User u = repo.findbyusername(username);
		if (u == null) {
			throw new UsernameNotFoundException("user not found");
		}

		return new cusUserDetails(u);
	}

}
