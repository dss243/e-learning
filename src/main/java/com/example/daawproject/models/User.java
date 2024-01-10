package com.example.daawproject.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
