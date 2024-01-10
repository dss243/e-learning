package com.example.daawproject.controllers;

import com.example.daawproject.entities.UserEntity;
import com.example.daawproject.models.User;
import com.example.daawproject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        User registeredUser = userService.registerUser(user);
        return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<UserEntity> loginUser(@RequestParam String Username, @RequestParam String password) {
        UserEntity loggedUser = userService.loginUser(Username, password);
        if (loggedUser != null) {
            return new ResponseEntity<>(loggedUser, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
    }
}

