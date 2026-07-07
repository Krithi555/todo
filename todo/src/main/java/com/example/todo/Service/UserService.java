package com.example.todo.Service;

import com.example.todo.Model.User;
import com.example.todo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    public User register(User user){

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);

    }

    public String login(User user){
        Optional<User> userOptional;
        userOptional = userRepository.findByUsername(user.getUsername());

        if(userOptional.isEmpty()){
            return "user does not exist";
        }

        User dbUser = userOptional.get();
        boolean isPasswordMatches = passwordEncoder.matches(user.getPassword(), dbUser.getPassword());
        if(!isPasswordMatches){
            return "Invalid Password";
        }

        return "Login successful";

    }



}
