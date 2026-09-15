package com.example.userservice.service;

import com.example.userservice.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class UserService {

    private final List<User> users = new ArrayList<>();
    private final AtomicLong idCounter = new AtomicLong();

    public UserService() {
        users.add(new User(idCounter.incrementAndGet(), "John", "john@example.com"));
        users.add(new User(idCounter.incrementAndGet(), "Alex", "alex@example.com"));
    }

    public List<User> getAllUsers() {
        return users;
    }

    public Optional<User> getUserById(Long id) {
        return users.stream().filter(u -> u.getId().equals(id)).findFirst();
    }

    public User createUser(User user) {
        user.setId(idCounter.incrementAndGet());
        users.add(user);
        return user;
    }
}
