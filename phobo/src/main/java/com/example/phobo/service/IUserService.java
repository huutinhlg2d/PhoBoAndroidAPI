package com.example.phobo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.phobo.domain.User;

@Service
public interface IUserService extends IService<User, Integer> {
    
}
