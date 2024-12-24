package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public List<User> getUserList() {
        return userService.getUserList();
    }

    @PostMapping("/add-user")
    public List<User> addUser(@RequestBody User user) {
        userService.getUserList().add(user);
        return userService.getUserList();
    }
}
