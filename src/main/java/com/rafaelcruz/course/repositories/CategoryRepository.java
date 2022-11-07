package com.rafaelcruz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelcruz.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	
}
