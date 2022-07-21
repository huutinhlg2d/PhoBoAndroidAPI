package com.example.phobo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.phobo.domain.User;
import com.example.phobo.service.IUserService;
import com.example.phobo.service.impl.UserService;

import net.bytebuddy.agent.VirtualMachine.ForHotSpot.Connection.Response;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAll() {

        List<User> users = userService.getAll();

        return ResponseEntity.ok(users);
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(User user) throws Exception {
        String email=user.getEmail();
        String pass=user.getPassword();
        User tempUser = null;

        if (email !=null && pass !=null) {
            tempUser= userService.login(email, pass);
        } 

        if (tempUser == null) {
            throw new Exception("login fail");
        }

        return ResponseEntity.ok(tempUser);


    }

    
}
