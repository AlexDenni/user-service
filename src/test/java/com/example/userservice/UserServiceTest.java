package com.example.userservice;

import com.example.userservice.model.User;
import com.example.userservice.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    private UserService userService;

    @BeforeEach
    void setUp() {
        userService = new UserService();
    }

    @Test
    void startsWithTwoSampleUsers() {
        assertEquals(2, userService.getAllUsers().size());
    }

    @Test
    void createUser_assignsIdAndAddsToList() {
        User newUser = new User(null, "Priya", "priya@example.com");
        User created = userService.createUser(newUser);

        assertNotNull(created.getId());
        assertEquals(3, userService.getAllUsers().size());
    }
}
