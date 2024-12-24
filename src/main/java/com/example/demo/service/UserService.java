package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {
    private List<User> userList = new ArrayList<>();

    public UserService() {
        userList.add(new User("Admin", "Admin"));
    }

    public List<User> getUserList() {
        return userList;
    }
}
