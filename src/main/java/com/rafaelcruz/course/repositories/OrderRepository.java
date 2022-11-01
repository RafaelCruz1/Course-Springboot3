package com.rafaelcruz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelcruz.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
}
