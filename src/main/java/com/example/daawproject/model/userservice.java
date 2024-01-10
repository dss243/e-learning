package com.example.daawproject.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userservice {
    private static UserRepository UserRepository;

    @Autowired
    public User registerUser(User User) {
        return UserRepository.save(User);}



        public User loginUser(String Username, String password) {
            return UserRepository.findByusername(Username);}
}
