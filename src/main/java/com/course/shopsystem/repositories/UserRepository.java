package com.course.shopsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.shopsystem.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
