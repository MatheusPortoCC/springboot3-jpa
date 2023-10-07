package com.course.shopsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.shopsystem.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
