package com.demo.springapp.model;
import jakarta.persistence.*;
import lombok.Data;
@Data
    @Entity
    @Table(name="users")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    @Version
    private Long version;
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private String role;
    private boolean status;    
}

    

