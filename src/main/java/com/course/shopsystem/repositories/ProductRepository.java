package com.course.shopsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.shopsystem.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
