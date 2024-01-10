package com.example.daawproject.services;

import com.example.daawproject.entities.UserEntity;
import com.example.daawproject.models.User;
import com.example.daawproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public User registerUser(User user) {

        //database data
        UserEntity entity = new UserEntity();
        entity.setUsername(user.getUserName());
        entity.setPassword(user.getPassword());
        entity.setFirstName(user.getFirstName());
        entity.setLastName(user.getLastName());
        entity.setEmail(user.getEmail());

        UserEntity savedEntity = userRepository.save(entity);

        //business logic data
        User savedUser = new User();
        savedUser.setUserName(savedEntity.getUsername());
        savedUser.setPassword(savedEntity.getPassword());
        savedUser.setFirstName(savedEntity.getFirstName());
        savedUser.setLastName(savedEntity.getLastName());
        savedUser.setEmail(savedEntity.getEmail());

        return savedUser;
    }
    public UserEntity loginUser(String Username, String password) {
        return userRepository.findByUsername(Username);
    }
}
