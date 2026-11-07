package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUserById(int id) {
        // Actual business logic would normally retrieve the user from a database.
        return new User(id, "Bhargav");
    }
}
