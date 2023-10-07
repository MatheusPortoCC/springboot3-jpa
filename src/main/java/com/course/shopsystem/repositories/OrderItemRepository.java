package com.course.shopsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.shopsystem.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    
}
