package com.rafaelcruz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelcruz.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	

}
