package com.restapi.users.user_rest_api.controller;

import com.restapi.users.user_rest_api.model.User;
import com.restapi.users.user_rest_api.service.UserService; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}
