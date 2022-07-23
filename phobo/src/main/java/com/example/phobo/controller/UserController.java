package com.example.phobo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.phobo.domain.User;
import com.example.phobo.domain.UserRole;
import com.example.phobo.service.IUserService;
import com.example.phobo.service.impl.UserService;

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
    public ResponseEntity<User> login(@RequestBody User user) throws Exception {
        Integer uid = user.getFirebaseUid();
        String email = user.getEmail();
        String pass = user.getPassword();
        User tempUser = null;

        if (uid != null && pass != null) {
            tempUser = userService.loginByEmail(email, pass);
        }

        if (tempUser == null) {
            throw new Exception("login fail");
        }

        return ResponseEntity.ok(tempUser);
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user) throws Exception {
        String regEmail=user.getEmail();
        UserRole userRole=user.getRole();
        if (userService.getUserByEmail(regEmail) != null ) throw new Exception ("Register Fail");
        else {
            user.setAvatarUrl("https://image.vtc.vn/upload/2021/07/07/38d6ee6d5b455a6b815e0920c6bfb0b4-06260856.jpg");
            if (userRole.equals(UserRole.PHOTOGRAPHER)) {
                user.setRole(UserRole.PENDINGPHOTOGRAPHER);
            }
            userService.save(user);
            return ResponseEntity.ok("success");
        }
    }

}
