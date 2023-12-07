package com.example.taskmanagerspringtest.Services.impl;

import com.example.taskmanagerspringtest.Entitiy.User;
import com.example.taskmanagerspringtest.Exceptions.UserNotFoundException;
import com.example.taskmanagerspringtest.Repository.UserRepository;
import com.example.taskmanagerspringtest.Services.UserService;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Data
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findUserByUsername(String username) throws UserNotFoundException {
        return userRepository.findUserByUsername(username).orElseThrow(() -> new UserNotFoundException("Пользователь не найден!"));
    }
}
