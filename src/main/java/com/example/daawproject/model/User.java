package com.example.daawproject.model;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="user")
@Data @AllArgsConstructor @NoArgsConstructor
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "username")
    private String username;


 
    @Column(name = "password")
    private Integer password; 

 
    @Column(name = "email")
    private Integer email; 

      @Column(name = "first_name")
    private Integer first_name;

      @Column(name = "last_name")
    private Integer last_name;

  
    private List <Role> role;
    
}
