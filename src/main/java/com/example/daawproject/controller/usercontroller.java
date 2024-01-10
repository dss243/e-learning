package com.example.daawproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.daawproject.model.User;
import com.example.daawproject.model.userservice;

@RestController
@RequestMapping("/api/users")
public class usercontroller {

    @Autowired
    private userservice userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User User) {
        User registeredUser = userService.registerUser(User);
        return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<User> loginUser(@RequestParam String Username, @RequestParam String password) {
        User loggedInUser = userService.loginUser(Username, password);
        if (loggedInUser != null) {
            return new ResponseEntity<>(loggedInUser, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
    }
}

