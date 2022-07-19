package com.example.phobo.controller;

import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.phobo.domain.User;
import com.example.phobo.domain.UserRole;
import com.example.phobo.service.IUserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAll() {

        List<User> users = userService.getAll();

        return ResponseEntity.ok(users);
    }

    @GetMapping("photographer/all")
    public ResponseEntity<List<User>> getAllPhotographer(){
        List<User> photographers = userService.getAllByRole(UserRole.PHOTOGRAPHER);
        return ResponseEntity.ok(photographers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") int id) {
        return ResponseEntity.of(userService.getById(id));
    }
    
}
