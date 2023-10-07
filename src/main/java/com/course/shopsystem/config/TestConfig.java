package com.course.shopsystem.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.course.shopsystem.entities.User;
import com.course.shopsystem.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        // Generate five users
        User u1 = new User(null, "Maria Brown", "maria@gmail", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail", "977777777", "123456");
        User u3 = new User(null, "Bob Grey", "bob@gmail", "966666666", "123456");
        User u4 = new User(null, "Anna White", "anna@gmail", "955555555", "123456");
        User u5 = new User(null, "John Black", "john@gmail", "944444444", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5));
    }
}
