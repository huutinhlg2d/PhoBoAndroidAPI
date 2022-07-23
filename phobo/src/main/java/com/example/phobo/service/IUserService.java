package com.example.phobo.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.example.phobo.domain.User;
import com.example.phobo.domain.UserRole;

@Service
public interface IUserService extends IService<User, Integer> {
    List<User> getAllByRole(UserRole role);
}
