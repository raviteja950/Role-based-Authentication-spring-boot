package com.security.Authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.security.Authentication.entity.User;

public interface Authenticationrepo extends JpaRepository<User, Long> {

	@Query("SELECT u from User u WHERE u.username= :username")
	public User findbyusername(@Param("username")  String username);
} 
