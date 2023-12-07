package com.example.taskmanagerspringtest.Controllers;

import com.example.taskmanagerspringtest.Entitiy.User;
import com.example.taskmanagerspringtest.Exceptions.UserNotFoundException;
import com.example.taskmanagerspringtest.Services.impl.UserServiceImpl;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    private UserServiceImpl userService;

    public AuthController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping(path = "/finduser")
    @ResponseBody
    public ResponseEntity<User> getUser(@RequestParam String username){
        User userResponse = null;
        try {
            userResponse = userService.findUserByUsername(username);
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
        // TODO сделать нормальную обработку
        ResponseEntity<User> userResponseEntity = new ResponseEntity<>(userResponse, HttpStatusCode.valueOf(200));

        return userResponseEntity;
    }
}
