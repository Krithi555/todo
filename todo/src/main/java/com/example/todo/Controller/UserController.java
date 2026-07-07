package com.example.todo.Controller;

import com.example.todo.Model.User;
import com.example.todo.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class UserController {
    @Autowired
    public UserService userService;

    @PostMapping("/register")
    public User registerUser(@Valid  @RequestBody User user){
        return userService.register(user);

    }

    @PostMapping("/login")
    public String loginUser(@Valid @RequestBody User user){
        return userService.login(user);

    }
    
    


}
