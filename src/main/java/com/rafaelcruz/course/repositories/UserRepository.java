package com.rafaelcruz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelcruz.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{
	
	
	
}
