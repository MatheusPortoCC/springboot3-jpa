package com.course.shopsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.shopsystem.entities.User;
import com.course.shopsystem.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;
    
    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> user = repository.findById(id);

        return user.get();
    }

    public User insert(User user) {
        return repository.save(user);
    }

    public void delete(Long id) { 
        repository.deleteById(id);
    }

    public User update(Long id, User user) {
        User userReferenced = repository.getReferenceById(id);

        updateData(userReferenced, user);

        return repository.save(userReferenced);
    }

    private void updateData(User userReferenced, User user) {
        userReferenced.setName(user.getName());
        userReferenced.setEmail(user.getEmail());
        userReferenced.setPhone(user.getPhone());
    }
}
