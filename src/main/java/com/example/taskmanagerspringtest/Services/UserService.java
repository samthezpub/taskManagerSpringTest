package com.example.taskmanagerspringtest.Services;

import com.example.taskmanagerspringtest.Entitiy.User;
import com.example.taskmanagerspringtest.Exceptions.UserNotFoundException;

import java.util.List;

public interface UserService {
    User findUserByUsername(String username) throws UserNotFoundException;

    List<User> findAllUsers();
}
