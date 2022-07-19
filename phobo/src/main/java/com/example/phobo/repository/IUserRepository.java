package com.example.phobo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.phobo.domain.User;
import com.example.phobo.domain.UserRole;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
    List<User> findAllByRole(UserRole role);
}
