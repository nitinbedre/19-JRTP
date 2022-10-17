package com.example.group.artifact.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.group.artifact.domain.User;
import com.example.group.artifact.services.UserService;

@RestController
@RequestMapping("/api/user")
public class UserResource {

    @Autowired
    PasswordEncoder passwordEncode;
    
    @Autowired
    UserService userService;
    
    @PostMapping("")
    public User register(@RequestBody User user) {
        String encryptedPassword;
        encryptedPassword = passwordEncode.encode(user.getPassword());
        user.setPassword(encryptedPassword);
        return userService.saveUser(user);
    }
}

