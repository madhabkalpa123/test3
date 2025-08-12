package com.example.demo.services;

import com.example.demo.entities.User;
import java.util.List;

public interface UserService {
    User saveUser(User user);
    User getUser(String userId);
    List<User> getAllUsers();
}

