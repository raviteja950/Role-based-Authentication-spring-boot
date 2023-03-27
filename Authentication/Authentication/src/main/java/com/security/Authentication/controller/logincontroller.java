package com.security.Authentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class logincontroller {

	@GetMapping("/")
	public String userinterface() {
		return "this is Raviinterface page";
	}

	@GetMapping("/user")
	public String user() {
		return "This is user page";
	}

	@GetMapping("/admin")
	public String admin() {
		return "This is admin page";
	}

}
