package com.example.phobo.service.impl;

import java.util.List;
import java.util.Optional;

import javax.management.relation.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.phobo.domain.User;
import com.example.phobo.domain.UserRole;
import com.example.phobo.repository.IUserRepository;
import com.example.phobo.service.IUserService;

@Service
public class UserService implements IUserService{
    
    @Autowired
    IUserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getById(Integer key) {
        return userRepository.findById(key);
    }

    @Override
    public User save(User entity) {
        return userRepository.save(entity);
    }

    @Override
    public void deleteById(Integer key) {
        userRepository.deleteById(key);
    }

    @Override
    public List<User> getAllByRole(UserRole role) {
        return userRepository.findAllByRole(role);
    }

}
