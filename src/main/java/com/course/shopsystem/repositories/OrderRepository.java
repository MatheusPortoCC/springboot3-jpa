package com.course.shopsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.shopsystem.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
