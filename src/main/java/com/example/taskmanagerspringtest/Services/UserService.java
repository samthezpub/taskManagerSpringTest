package com.example.taskmanagerspringtest.Services;

import com.example.taskmanagerspringtest.Entitiy.User;
import com.example.taskmanagerspringtest.Exceptions.UserNotFoundException;

public interface UserService {
    User findUserByUsername(String username) throws UserNotFoundException;
}
