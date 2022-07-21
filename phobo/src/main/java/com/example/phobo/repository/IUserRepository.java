package com.example.phobo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.phobo.domain.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
    public User findByEmailAndPassword(String email, String password);
}
